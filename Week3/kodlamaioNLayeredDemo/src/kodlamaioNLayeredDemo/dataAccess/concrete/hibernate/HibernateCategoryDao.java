package kodlamaioNLayeredDemo.dataAccess.concrete.hibernate;


import java.util.ArrayList;
import java.util.List;


import kodlamaioNLayeredDemo.dataAccess.abstracts.ICategoryDao;
import kodlamaioNLayeredDemo.entities.concrete.Category;

public class HibernateCategoryDao implements ICategoryDao  {

	private List<Category> categories = new ArrayList<Category>();
	
	@Override
	public void add(Category category) {
		this.categories.add(category);
	}

	@Override
	public Category getCategoryById(int id) {
		return this.categories.stream().filter(c->c.getId()==id).findFirst().get();
	}

	@Override
	public List<Category> getAll() {
		return this.categories;
		
	}



}
