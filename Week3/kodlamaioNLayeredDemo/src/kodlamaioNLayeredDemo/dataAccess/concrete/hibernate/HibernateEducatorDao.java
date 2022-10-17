package kodlamaioNLayeredDemo.dataAccess.concrete.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlamaioNLayeredDemo.dataAccess.abstracts.IEducatorDao;
import kodlamaioNLayeredDemo.entities.concrete.Educator;

public class HibernateEducatorDao implements IEducatorDao {

	private List<Educator> educators = new ArrayList<Educator>();

	@Override
	public void add(Educator educator) {
		educators.add(educator);
		
	}

	@Override
	public List<Educator> getAll() {		
		return educators;
	}

	@Override
	public Educator getCategoryById(int id) {
		return educators.stream().filter(e->e.getId()==id).findFirst().get();
	}


}
