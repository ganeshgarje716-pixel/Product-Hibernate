package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Config.HibernateConfig;
import com.Entity.Product;

public class ProductDao {
	
	
	
		
		SessionFactory sf = HibernateConfig.getSessionFactory();
	
		
		
		public String insertProduct(Product product) {
			
			Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.save(product);
			
			tr.commit();
			
			session.close();
			
			return "Insert Product";
		}
		
		
		
		
		public Product getProduct(int id) {
			
			Session session = sf.openSession();
			
			Product product = session.get(Product.class, id);
			
			return product;
		}
		
		
		
		
		
		
		
		
		
	

}
