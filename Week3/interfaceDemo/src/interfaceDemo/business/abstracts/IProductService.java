package interfaceDemo.business.abstracts;

import interfaceDemo.entities.concretes.Product;

public interface IProductService {
	void add(Product product);
    void delete(Product product);
    void update(Product product);
    void getAll();
}
