package inheritance.business.abstracts;

import inheritance.entities.concretes.Product;

public interface IProductService {
	void add(Product product);
    void delete(Product product);
    void update(Product product);
    void getAll();
}
