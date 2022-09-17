package Business.Concrete;

import Business.Abstract.IProductService;
import DataAccess.Abstract.IProductDao;
import Entities.Concrete.Product;

public class ProductManager implements IProductService {

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
        _productDao.get();    }
}
