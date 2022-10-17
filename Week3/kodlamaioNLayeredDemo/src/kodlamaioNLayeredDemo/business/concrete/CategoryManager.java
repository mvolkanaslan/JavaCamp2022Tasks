package kodlamaioNLayeredDemo.business.concrete;

import java.util.List;

import kodlamaioNLayeredDemo.business.abstracts.ICategoryService;
import kodlamaioNLayeredDemo.business.validationRules.CategoryValidator;
import kodlamaioNLayeredDemo.business.validationRules.ValidationResult;
import kodlamaioNLayeredDemo.core.logging.ILogger;
import kodlamaioNLayeredDemo.dataAccess.abstracts.ICategoryDao;
import kodlamaioNLayeredDemo.entities.concrete.Category;

public class CategoryManager implements ICategoryService {

	private ICategoryDao categoryDao;
	private List<ILogger> loggers;
	public CategoryManager(ICategoryDao categoryDao,List<ILogger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	
	@Override
	public void add(Category category) {
		ValidationResult validationResult = CategoryValidator.Validate(category,categoryDao.getAll());
		if(validationResult.isResult()) {
			categoryDao.add(category);
			loggers.forEach(logger->logger.log("Category Added ! : " + category.getName()));
		}
		else {
			System.out.println(validationResult.getMessage());
		}

		
	}
		
	@Override
	public List<Category> getAll() {
		return categoryDao.getAll();
		
	}
	
	@Override
	public Category getCategoryById(int id) {
		return categoryDao.getCategoryById(id);
		
	}
	
	
}
