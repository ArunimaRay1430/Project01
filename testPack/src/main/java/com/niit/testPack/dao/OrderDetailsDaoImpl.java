package com.niit.testPack.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.testPack.model.OrderDetails;
import com.niit.testPack.model.Users;

@Repository("orderDetailsDao")
@Transactional

public class OrderDetailsDaoImpl implements OrderDetailsDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public OrderDetails getOrderDetailsByOrderDetailsId(int orderDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateOrderDetails(OrderDetails orderDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteOrderDetails(OrderDetails orderDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean insertOrderDetails(OrderDetails orderDetails) {
		
		Session session = getSession();
		session.save(orderDetails);
		session.flush();
		session.close();
		return true;
	}

	public List<OrderDetails> getOrderDetailsListByUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
