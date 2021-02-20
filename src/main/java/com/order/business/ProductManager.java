package com.order.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.order.dataaccess.IProductDal;
import com.order.dto.ProductDetailDto;
import com.order.entities.Product;

@Service
public class ProductManager implements IProductService {
	
	@Autowired
	IProductDal productDal;
	
	@Override
	public void add(Product product) {
		productDal.save(product);
	}

	@Override
	public List<Product> findAll() {
		return productDal.findAll();
	}

	@Override
	public Product getById(Long id) {
		return productDal.getOne(id);
	}

	@Override
	public List<Product> getAllByCategoryId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByUnitPrice(double min, double max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDetailDto> getProductDetailDtos() {
		// TODO Auto-generated method stub
		return null;
	}



	
   
	
}
