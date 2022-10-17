package kodlamaioNLayeredDemo.dataAccess.abstracts;

import java.util.List;

import kodlamaioNLayeredDemo.entities.concrete.Category;

public interface ICategoryDao {
	void add(Category category);
	List<Category> getAll();
	Category getCategoryById(int id);
}
