package com.order.dataaccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.order.entities.Product;

//@Repository
public interface IProductDal  {
	


	List<Product> findAll();


	Product getOne(Long id);
	
	Product save(Product entity);



}
