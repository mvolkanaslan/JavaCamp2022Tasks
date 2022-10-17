package kodlamaioNLayeredDemo.business.concrete;

import java.util.List;
import kodlamaioNLayeredDemo.business.abstracts.ICourseService;
import kodlamaioNLayeredDemo.business.validationRules.CourseValidator;
import kodlamaioNLayeredDemo.business.validationRules.ValidationResult;
import kodlamaioNLayeredDemo.core.logging.ILogger;
import kodlamaioNLayeredDemo.dataAccess.abstracts.ICourseDao;
import kodlamaioNLayeredDemo.entities.concrete.Course;

public class CourseManager implements ICourseService {

	private ICourseDao courseDao;
	private List<ILogger> loggers;
	
	public CourseManager(ICourseDao courseDao,List<ILogger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Course course) {
		ValidationResult validationResult = CourseValidator.Validate(course, courseDao.getAll());
		if(validationResult.isResult()) {
			courseDao.add(course);
			loggers.forEach(logger->logger.log("Course Added ! : " + course.getName()));
		}
		else {
				System.out.println(validationResult.getMessage());
		}
	}

	@Override
	public List<Course> getAll() {
		return courseDao.getAll();
	}
	@Override
	public Course getCourseById(int id) {
		// TODO Auto-generated method stub
		return courseDao.getCategoryById(id);
	}

}
