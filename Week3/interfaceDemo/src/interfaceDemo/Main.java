package interfaceDemo;

import interfaceDemo.business.concretes.ProductManager;
import interfaceDemo.dataAccess.concretes.entityFramework.EfProductDao;
import interfaceDemo.entities.concretes.Product;

public class Main {

public static void main(String[] args) {
		
		ProductManager productManager = new ProductManager(new EfProductDao());
//         ProductManager productManager = new ProductManager(new hibernateProductDao()); 

        Product product1 = new Product(1,"Laptop","i7 Gen 9",19750,20);
        productManager.add(product1);
        productManager.delete(product1);

	}

}
