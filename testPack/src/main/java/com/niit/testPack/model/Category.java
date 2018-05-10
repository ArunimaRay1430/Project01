package com.niit.testPack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

//import antlr.collections.List;
import java.util.List;

@Entity

public class Category {
	
	@Id
	@GeneratedValue
	@NotEmpty(message = "Please enter Category id")
	private int categoryId;
	@NotEmpty(message = "Please enter Category Name")
	private String categoryName;
	
	@OneToMany(mappedBy="productCategory")
	List<Product> products;


	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
