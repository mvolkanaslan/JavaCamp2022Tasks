package kodlamaioNLayeredDemo.dataAccess.abstracts;

import java.util.List;

import kodlamaioNLayeredDemo.entities.concrete.Course;

public interface ICourseDao {

	void add(Course course);
	List<Course> getAll();
	Course getCategoryById(int id);
}
