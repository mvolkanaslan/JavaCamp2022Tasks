package kodlamaioNLayeredDemo.dataAccess.concrete.jdbc;

import java.util.ArrayList;
import java.util.List;

import kodlamaioNLayeredDemo.dataAccess.abstracts.ICourseDao;
import kodlamaioNLayeredDemo.entities.concrete.Course;

public class JdbcCourseDao implements ICourseDao{

	private List<Course> courses = new ArrayList<Course>();
	
	@Override
	public void add(Course course) {
		courses.add(course);
	}

	@Override
	public List<Course> getAll() {
		return courses;
	}

	@Override
	public Course getCategoryById(int id) {
		return courses.stream().filter(c->c.getId()==id).findFirst().get();
	}

}
