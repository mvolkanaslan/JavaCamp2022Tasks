import Business.Concrete.ProductManager;
import DataAccess.Concrete.EntityFramework.EFProductDao;
import DataAccess.Concrete.Hibernate.HibernateProductDao;
import Entities.Concrete.Product;

public class Main {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager(new EFProductDao());
        /* ProductManager productManager = new ProductManager(new HibernateProductDao()); */

        Product product1 = new Product(1,"Laptop","i7 Gen 9",19750,20);
        productManager.add(product1);
        productManager.delete(product1);
    }
}