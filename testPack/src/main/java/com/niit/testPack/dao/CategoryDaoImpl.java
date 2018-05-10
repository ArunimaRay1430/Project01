package com.niit.testPack.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.testPack.model.Category;


@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	
		@Autowired
		private SessionFactory sessionFactory;

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

		protected Session getSession() {
			return sessionFactory.openSession();
		}

		public List<Category> getAllCategory() {
			
			Session session = getSession();

			Query query = session.createQuery("from Category"); 
			List<Category> categorylist = query.list();

			return categorylist;
			
		}
	}
