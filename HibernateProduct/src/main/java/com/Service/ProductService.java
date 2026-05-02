package com.Service;

import com.Dao.ProductDao;
import com.Entity.Product;

public class ProductService {
	
	
	ProductDao dao=new ProductDao();
	
	
	
	public String insert(Product product) {
		
		return dao.insertProduct(product);
	}
	
	
	public Product get(int id) {
		
		return dao.getProduct(id);
	}
	
	
	
	
	
	
	
	
	
	

}
