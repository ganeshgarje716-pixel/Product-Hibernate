package com.Dao;

import org.hibernate.SessionFactory;

import com.Config.HibernateConfig;

public class ProductDao {
	
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateConfig.getSessionFactory();
	}
	

}
