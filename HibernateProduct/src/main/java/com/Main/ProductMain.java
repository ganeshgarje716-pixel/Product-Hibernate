package com.Main;

import com.Controller.ProductController;
import com.Entity.Product;

public class ProductMain {
	
	public static void main(String[] args) {
		
		
		
		ProductController controller=new ProductController();
		
		
//		System.out.println(controller.insert(new Product(1, "Laptope", 70000, "Dell", 30)));
		
		
//		System.out.println(controller.get(1));
		
		
		System.out.println(controller.update(new Product(1, "Laptope", 75000, "HP", 40)));
		
		
		
	}
	
	

}
