package com.niit.testPack.dao;

import java.util.List;

import com.niit.testPack.model.ShippingAddress;
import com.niit.testPack.model.Users;



public interface UsersDao {
	
	public void addUsers(Users users);
	public List<Users> getAllUsers();
	public Users getUsersById(String userId);
	public void updateUsers(Users users);
	public void deleteUsers(String userId);
	public boolean checkUserId(String userId);
	public void addShippingAddress(ShippingAddress shippingaddress);
	public ShippingAddress getShippingAddressById(int id);
	public List<ShippingAddress> getShippingAddressByUserId(String userId);
}
