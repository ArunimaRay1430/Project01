package com.niit.testPack.dao;

import java.util.List;

import com.niit.testPack.model.Product;
import com.niit.testPack.model.Users;

public interface ProductDao {
	public List<Product> getAllProducts();

	public Product getProductById(String id);

	public void saveOrUpdateProduct(Product product);
	
	public List<Product> listByCategoryId(int categoryId);
	
	public void deleteProduct(String id);
	public void updateProduct(Product product);
	public void addProduct(Product product);

}
