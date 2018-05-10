package com.niit.testPack.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartFile;

@Entity

public class Product {
	@Id
	@GeneratedValue
	//@Column(name="userid")
	private String productId;
	@NotEmpty(message = "Please enter product Name")
	private String productName;
	@Column(columnDefinition="varchar(1000)")
	private String productDesc;
	@Min(value=1,message="minimum price must be 1")
	private int price;
	@Min(value=0,message="quantity cannot be negative")
	private int quantity;
	
	@Transient //not persistent
	private MultipartFile image;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category productCategory;
	
	@OneToMany(mappedBy="product",cascade=CascadeType.ALL)
	List<CartItems> carts;
	
	public MultipartFile getImage() {
		return image;
	}


	public void setImage(MultipartFile image) {
		this.image = image;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public List<CartItems> getCarts() {
		return carts;
	}


	public void setCarts(List<CartItems> carts) {
		this.carts = carts;
	}


	public Category getProductCategory() {
		return productCategory;
	}


	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDesc() {
		return productDesc;
	}


	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Product()
	{
	}
	
}
