package DataAccess.Abstract;

import Entities.Concrete.Product;

public interface IProductDao {
    void add(Product product);
    void delete(Product product);
    void update(Product product);
    void get();
}
