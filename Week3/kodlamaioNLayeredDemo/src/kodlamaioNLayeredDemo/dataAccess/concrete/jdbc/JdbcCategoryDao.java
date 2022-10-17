package kodlamaioNLayeredDemo.dataAccess.concrete.jdbc;

import java.util.ArrayList;
import java.util.List;

import kodlamaioNLayeredDemo.dataAccess.abstracts.ICategoryDao;
import kodlamaioNLayeredDemo.entities.concrete.Category;

public class JdbcCategoryDao implements ICategoryDao {

	private List<Category> categories = new ArrayList<Category>();
	
	@Override
	public void add(Category category) {
		categories.add(category);
	}

	@Override
	public List<Category> getAll() {
		return categories;
	}

	@Override
	public Category getCategoryById(int id) {
		return categories.stream().filter(c->c.getId()==id).findFirst().get();
	}

}
