package Business.Abstract;

import Entities.Concrete.Product;

public interface IProductService {
    void add(Product product);
    void delete(Product product);
    void update(Product product);
    void getAll();

}
