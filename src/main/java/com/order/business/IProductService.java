package com.order.business;

import java.util.List;
import com.order.dto.ProductDetailDto;
import com.order.entities.Product;

public interface IProductService {

	List<Product> findAll();

	List<Product> getAllByCategoryId(Long id);

	List<Product> getByUnitPrice(double min, double max);

	List<ProductDetailDto> getProductDetailDtos();

	Product getById(Long id);

	void add(Product product);

}
