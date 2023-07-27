package com.service;

import java.util.List;
import java.util.Optional;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Category;
import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public String storeProduct(Product product) {
		productRepository.save(product);
		return "Product details stored successfully";
	}
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}
	
	public void decrementQty(int pid) {
		Optional<Product> result = productRepository.findById(pid);
		if(result.isPresent()) {
			Product p = result.get();
			p.setQty(p.getQty()-1);
			productRepository.saveAndFlush(p);	// like update 
		}
	}
	
	
	public String deleteProduct(int pid) {
		Optional<Product> results = productRepository.findById(pid);
		if(results.isPresent()) {
			Product p = results.get();
				productRepository.delete(p);
				return "Product deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	
	
	public String updateProduct(Product product) {
		Optional<Product> result = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			Product p = result.get();
				p.setPrice(product.getPrice());
				p.setPname(product.getPname());
				productRepository.saveAndFlush(p);
				return "Product updated successfully";
		}else {
			return "Product not present";
		}
	}
	
	public Product findProductById(int pid) {
		Optional<Product> result = productRepository.findById(pid);
		if(result.isPresent()) {
			Product p = result.get();
			return p;
		}else {
			return null;
		}
		
	}
	
	public String placeOrder(Product product) {
		Optional<Product> result = productRepository.findById(product.getPid());
				return "Order placed successfully";
	}
	

	
	
	
	
}
