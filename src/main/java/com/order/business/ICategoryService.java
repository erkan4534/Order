package com.order.business;

import java.util.List;
import com.order.entities.Category;

public interface ICategoryService{

	List<Category> getAll();
	
	Category getById(Long id);
}
