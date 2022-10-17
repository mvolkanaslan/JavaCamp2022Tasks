package kodlamaioNLayeredDemo.business.concrete;

import java.util.List;

import kodlamaioNLayeredDemo.business.abstracts.IEducatorService;
import kodlamaioNLayeredDemo.business.validationRules.EducatorValidator;
import kodlamaioNLayeredDemo.business.validationRules.ValidationResult;
import kodlamaioNLayeredDemo.core.logging.ILogger;
import kodlamaioNLayeredDemo.dataAccess.abstracts.IEducatorDao;
import kodlamaioNLayeredDemo.entities.concrete.Educator;

public class EducatorManager implements IEducatorService{

	private IEducatorDao educatorDao;
	private List<ILogger> loggers;
	
	public EducatorManager(IEducatorDao educatorDao,List<ILogger> loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}
	
	@Override
	public void add(Educator educator) {
		ValidationResult validationResult = EducatorValidator.Validate(educator,educatorDao.getAll());
		if(validationResult.isResult()) {
			educatorDao.add(educator);		
			loggers.forEach(logger->logger.log("Educator Added ! : " + educator.getFirstName() + " " + educator.getLastName()));
		}
		else {
			System.out.println(validationResult.getMessage());
		}
	}

	@Override
	public List<Educator> getAll() {
		return educatorDao.getAll();
	}
	@Override
	public Educator getEducatorById(int id) {
		return educatorDao.getCategoryById(id);
	}

}
