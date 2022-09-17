package DataAccess.Concrete.EntityFramework;

import DataAccess.Abstract.IProductDao;
import Entities.Concrete.Product;

public class EFProductDao implements IProductDao {
    @Override
    public void add(Product product) {
        System.out.println("EntityFramework : Product Added - " + product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("EntityFramework : Product Deleted - " + product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("EntityFramework : Product Updated - " + product.getName());
    }

    @Override
    public void get() {
        System.out.println("EntityFramework : Product Listed !");
    }
}
