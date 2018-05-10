package com.niit.testPack.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.testPack.model.CartItems;
import com.niit.testPack.model.Users;

@Repository("cartItemsDao")
@Transactional

public class CartItemsDaoImpl implements CartItemsDao {

	
		@Autowired
		private SessionFactory sessionFactory;

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

		protected Session getSession() {
			return sessionFactory.openSession();
		}

		public void addCartItems(CartItems cartItems) {
			// TODO Auto-generated method stub
			Session session = getSession();
			session.save(cartItems);
			session.flush();
			session.close();
		
		
	}

		public List<CartItems> getAllCartItems() {
			
			Session session = getSession();

			Query query = session.createQuery("from CartItems"); 
			List<CartItems> cartList = query.list();

			return cartList;
		}

		public void updateCartItems(CartItems cartItems) {
			Session session = getSession();

			session.update(cartItems);

			session.flush();

			session.close();
			
		}

		public List<CartItems> getCartItemsByCartId(String cartId) {
			Session session = getSession();
			List <CartItems> list;
			Query query = session.createQuery("from CartItems where cart.cartId = ? and status = ?");
			query.setString(0, cartId);
			query.setBoolean(1, true);
			

			list = query.list();
			session.close();
			return list;
		}

		public void deleteCartItems(String cartItemsId) {
			// TODO Auto-generated method stub
			Session session = getSession();

			Query query = session.createQuery("from CartItems where cartItemId = ?");
			query.setString(0, cartItemsId);

			CartItems ci=(CartItems) query.uniqueResult();
			session.delete(ci);
			session.flush();

			session.close();
			
		}

		public List<CartItems> getCartItemsByOrderId(String orderDetailsId) {
			
			Session session = getSession();
			List <CartItems> orderedList;
			Query query = session.createQuery("from CartItems where orderDetails.orderDetailsId = ? and status = ?");
			query.setString(0, orderDetailsId);
			query.setBoolean(1, false);
			

			orderedList = query.list();
			return orderedList;
			
		}

		
			
		
	

}
