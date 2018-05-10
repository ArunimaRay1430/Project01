package com.niit.testPack.dao;


import java.util.List;

import com.niit.testPack.model.CartItems;
import com.niit.testPack.model.Users;

public interface CartItemsDao {
	public void addCartItems(CartItems cartItems);
	public List<CartItems> getAllCartItems();
	public void updateCartItems(CartItems cartItems);
	public List<CartItems> getCartItemsByCartId(String cartId);
	public void deleteCartItems(String cartItemsId);
	public List<CartItems> getCartItemsByOrderId(String orderDetailsId);

}
