package interfaceDemo.dataAccess.abstracts;

import interfaceDemo.entities.concretes.Product;

public interface IProductDao {
	void add(Product product);
    void delete(Product product);
    void update(Product product);
    void get();
}
