package kodlamaioNLayeredDemo.business.abstracts;

import java.util.List;

import kodlamaioNLayeredDemo.entities.concrete.Course;

public interface ICourseService {
	void add(Course course);
	List<Course> getAll();
	Course getCourseById(int id);
}
