package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProduct(Product product) {
		if(product.getPrice()<1000) {
			return "Product price must be > 1000";
		}else if(productDao.storeProductDetails(product)>0){
			return "Product details stored successfully";
		}else {
			return "Product details didn't store";
		}
	}
	
	public String updateProduct(Product product) {
		if(productDao.updateProduct(product)>0) {
			return "Product updated successfully";
		}
		else {
			return "product didn't got updated";
		}
	}
	
	public String deleteProduct(int pid) {
		if(productDao.deleteProduct(pid)>0) {
			return "Product deleted successfully";
		}
		else {
			return "product didn't got deleted";
		}
	}
	
	public String searchProductById(int pid) {
		Product p = productDao.searchProductById(pid);
		if(p==null) {
			return "Record not present";
		}else {
			return p.toString();
		}
	}
}
