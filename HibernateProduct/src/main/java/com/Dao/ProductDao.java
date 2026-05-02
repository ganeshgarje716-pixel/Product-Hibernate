package com.Dao;

import java.util.List;

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
		
		 
		
		
		public String updateById(Product product) {
			
			Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			
			Product existing = session.get(Product.class, product.getId());
			
			existing.setName(product.getName());
			existing.setPrice(product.getPrice());
			existing.setCategory(product.getCategory());
			existing.setQty(product.getQty());
			
			session.update(existing);
			
			tr.commit();
			
			session.close();
			
			return "Product Update";
		}
		
		
		
		
		
		public List<Product> getAll() {
			
			Session session = sf.openSession();
			
			List<Product> product = session.createQuery("from Product").list();
			
			return product;
		}
		
		
		
		
		public String deleteProduct(int id) {
			
			Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			
			Product product = session.get(Product.class, id);
			
			session.delete(product);
			
			tr.commit();
			
			session.close();
			
			return "Product Delete";
		}
		
		
		
		
		
		
		
	

}
