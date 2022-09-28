package inheritance.dataAccess.concretes.entityFramework;
import inheritance.dataAccess.abstracts.IProductDao;
import inheritance.entities.concretes.Product;

public class EfProductDao implements IProductDao {
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
