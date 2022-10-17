package kodlamaioNLayeredDemo.business.abstracts;

import java.util.List;

import kodlamaioNLayeredDemo.entities.concrete.Educator;

public interface IEducatorService {
	void add(Educator educator);
	List<Educator> getAll();
	Educator getEducatorById(int id);
	

}
