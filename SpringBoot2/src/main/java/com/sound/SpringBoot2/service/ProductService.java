package com.sound.SpringBoot2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sound.SpringBoot2.model.Product;

@Service
public class ProductService {
	public List<Product> allProducts;
	public ProductService() {
		allProducts= new ArrayList<>();
		
		 Product product1=new Product();
		 product1.setCategory("Dogs");
		 product1.setId(1);
		 product1.setName("Husky");
		 product1.setPrice(2000);
		 
		 Product product2=new Product();
		 product2.setCategory("shoes");
		 product2.setId(2);
		 product2.setName("bata");
		 product2.setPrice(2200);
		 
		 Product product3=new Product();
		 product3.setCategory("smartphn");
		 product3.setId(3);
		 product3.setName("iphn");
		 product3.setPrice(5000);
		 
		 
		allProducts.add(product1);
		allProducts.add(product2);
		allProducts.add(product3);
	}
	public void add(Product  product) {
		product.setId(allProducts.size()+1);
		allProducts.add(product);
		
		
	}
	public List<Product> getAllProducts(){
	return allProducts;
	}
	public void edit(Product product) {
		// TODO Auto-generated method stub
		long id=product.getId();
		Product productDB=getProductById(id);
	if(productDB!= null) {
		 productDB.setName(product.getName());
		 productDB.setCategory(product.getCategory());
		 productDB.setPrice(product.getPrice());
	 }
	}
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		for(Product productDB:allProducts) {
			if(productDB.getId()==id) {
		return productDB;
	}
			
	}
		return null;

}
	public void deleteProductById(long id){
		 
		 Product tobedeleted=null;
		
		for(Product productDB:allProducts) {
				if(productDB.getId()==id) {
					tobedeleted=productDB;
					break;
				}
			
		}
		 allProducts.remove(tobedeleted);
		 
	 }
}
 