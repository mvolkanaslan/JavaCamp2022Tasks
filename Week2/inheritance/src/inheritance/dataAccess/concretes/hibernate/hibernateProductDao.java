package inheritance.dataAccess.concretes.hibernate;

import inheritance.dataAccess.abstracts.IProductDao;
import inheritance.entities.concretes.Product;

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
