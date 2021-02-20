package com.order.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.order.dataaccess.ICategoryDal;
import com.order.entities.Category;

public class CategoryManager implements ICategoryService {

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
   
//	@Autowired
//	ICategoryDal categoryDal;
//	
//	@Override
//	public List<Category> getAll() {
//		return categoryDal.findAll();
//	}
//
//	@Override
//	public Category getById(Long id) {
//		
//		return categoryDal.getOne(id);
//	}

}
