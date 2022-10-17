package kodlamaioNLayeredDemo.dataAccess.abstracts;

import java.util.List;

import kodlamaioNLayeredDemo.entities.concrete.Educator;

public interface IEducatorDao {
	void add(Educator educator);
	List<Educator> getAll();
	Educator getCategoryById(int id);
}
