package kodlamaioNLayeredDemo.business.validationRules;

import java.util.List;

import kodlamaioNLayeredDemo.entities.concrete.Course;

public class CourseValidator {

public static ValidationResult Validate(Course course,List<Course> courses) {
		
		if(course.getName().length()<=0) return new ValidationResult(false,"The Course Name can not be null !");
		if(course.getPrice()<=0) return new ValidationResult(false,"The Course Price must be greater then zore ! : " + course.getName() );
		if(courses.stream().anyMatch(c->c.getName()==course.getName())) 
			return new ValidationResult(false,"The Course already exist ! : " + course.getName());
		return new ValidationResult(true);
		
	}
}
