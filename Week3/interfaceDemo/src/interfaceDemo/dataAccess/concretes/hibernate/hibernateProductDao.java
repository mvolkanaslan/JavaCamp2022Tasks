package interfaceDemo.dataAccess.concretes.hibernate;

import interfaceDemo.dataAccess.abstracts.IProductDao;
import interfaceDemo.entities.concretes.Product;

public class hibernateProductDao implements IProductDao{
	@Override
    public void add(Product product) {
        System.out.println("Hibernate : Product Added - " + product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Hibernate : Product Deleted - " + product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("Hibernate : Product Updated - " + product.getName());
    }

    @Override
    public void get() {
        System.out.println("Hibernate : Product Listed !");
    }
}
