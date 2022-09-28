package inheritance.business.concretes;

import inheritance.business.abstracts.IProductService;
import inheritance.dataAccess.abstracts.IProductDao;
import inheritance.entities.concretes.Product;

public class ProductManager implements IProductService {

	
//  Database veri erisimi icin alternatifleri degerlendirebilmek icin Soyut IProductDao sinifindan kalitim alan
//	Herhangi bir dataaccess erisim katmani kullanilabilir
//	Yapmis oldugumuz dependency injection yöntemidir
	
	private IProductDao _productDao;

    public ProductManager(IProductDao productDao) {
        _productDao = productDao;
    }

    @Override
    public void add(Product product) {
        _productDao.add(product);
    }

    @Override
    public void delete(Product product) {
        _productDao.delete(product);
    }

    @Override
    public void update(Product product) {
        _productDao.update(product);
    }

    @Override
    public void getAll() {
        _productDao.get();    
    }

}
