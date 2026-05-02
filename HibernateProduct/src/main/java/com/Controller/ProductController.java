package com.Controller;

import com.Entity.Product;
import com.Service.ProductService;

public class ProductController {
	
	
	
	ProductService service=new ProductService();
	
	
	
	public String insert(Product product) {
		
		return service.insert(product);
	}
	
	
	public Product get(int id) {
		
		return service.get(id);
	}
	
	
	public String update(Product product) {
		
		return service.update(product);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
