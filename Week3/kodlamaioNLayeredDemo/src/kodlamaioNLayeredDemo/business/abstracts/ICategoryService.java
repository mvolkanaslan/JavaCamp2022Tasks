package kodlamaioNLayeredDemo.business.abstracts;

import java.util.List;

import kodlamaioNLayeredDemo.entities.concrete.Category;

public interface ICategoryService {
	void add(Category category);
	List<Category> getAll();
	Category getCategoryById(int id);
}
