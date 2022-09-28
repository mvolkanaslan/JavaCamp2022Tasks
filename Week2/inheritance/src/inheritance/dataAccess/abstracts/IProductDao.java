package inheritance.dataAccess.abstracts;

import inheritance.entities.concretes.Product;

public interface IProductDao {
	void add(Product product);
    void delete(Product product);
    void update(Product product);
    void get();
}
