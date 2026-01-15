package com.curd.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.curd.model.Product;

@Component
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	// create and Update
	@Transactional
	public void createProduct(Product product ) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	// Get all products
	public List<Product> products(){
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	//Delete the product
	@Transactional
	public void deleteProduct(int id) {
	 Product p =	this.hibernateTemplate.load(Product.class,id);
	 this.hibernateTemplate.delete(p);
	}
	//get single product
	public Product getProduct(int id) {
		 return this.hibernateTemplate.get(Product.class, id);
	}
} 
