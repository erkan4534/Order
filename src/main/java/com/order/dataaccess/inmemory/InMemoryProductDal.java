package com.order.dataaccess.inmemory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.order.dataaccess.IProductDal;
import com.order.entities.Category;
import com.order.entities.Product;

@Repository
public class InMemoryProductDal implements IProductDal {

	List<Product> productList;

	@SuppressWarnings("serial")
	public InMemoryProductDal() {

		productList = new ArrayList<Product>() {
			{
				add(new Product(1L, new Category(1L, "elektronik"), "Bardak", 15D,  15L));
				add(new Product(2L, new Category(1L, "elektronik"), "Kamera", 500D, 3L));
				add(new Product(3L, new Category(2L, "elektronik"), "Telefon", 1500D, 2L));
				add(new Product(4L, new Category(2L, "elektronik"), "Klavye", 150D,  65L));
				add(new Product(5L, new Category(2L, "elektronik"), "Fare", 85D,  1L));
			}
		};
	}
	
	@Override
	public Product save(Product entity) {

		Optional<Product> productOption = productList.stream().filter(a -> a.getId().equals(entity.getId())).findAny();

		if (productOption.isPresent()) {

			Product product = productOption.get();

			product.setId(entity.getId());
			product.setCategory(entity.getCategory());
			product.setProductName(entity.getProductName());
			product.setUnitPrice(entity.getUnitPrice());
			product.setUnitsInStock(entity.getUnitsInStock());

		} else {
			productList.add(entity);
		}

		return entity;

	}

	@Override
	public List<Product> findAll() {
		return productList;
	}


	@Override
	public Product getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



}
