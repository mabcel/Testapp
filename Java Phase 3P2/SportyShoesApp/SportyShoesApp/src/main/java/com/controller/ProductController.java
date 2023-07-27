package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Category;
import com.bean.Product;
import com.service.CategoryService;
import com.service.ProductService;

@Controller
public class ProductController {

	
	
	@Autowired
	ProductService productService;
	@Autowired 
	CategoryService categoryService;
	
//	@RequestMapping(value = "/adminHome",method = RequestMethod.GET)
//	public String back(Model mm, Product pp) {
//		mm.addAttribute("product", pp);
//		return "adminHome";
//	}
	
	@RequestMapping(value = "/addProductPage",method = RequestMethod.GET)
	public String addProductPage(Model mm, Product pp) {
			mm.addAttribute("product", pp);
		List<Category> listOfCategory = categoryService.findAllCategory();
			mm.addAttribute("category",listOfCategory);
		return "addProduct";
	}
	
	
	@RequestMapping(value = "/storeProductInfo",method = RequestMethod.POST)
	public String storeProductInfo(Model mm,Product pp) {
		String result = productService.storeProduct(pp);
		mm.addAttribute("product", pp);
		mm.addAttribute("msg", result);
		//List<Category> listOfCategory = categoryService.findAllCategory();
		//mm.addAttribute("category",listOfCategory);
		System.out.println(pp);  
		return "addProduct";
	}
	
	
	@RequestMapping(value = "/viewProductDetailsByCustomer",method = RequestMethod.GET)
	public String viewProduct(Model mm, Product pp) {
		List<Product> listOfProducts = productService.findAllProduct();
		mm.addAttribute("products", listOfProducts);
		
		return "viewProductsByCustomer";
	}
	
	
	@RequestMapping(value = "/viewProductByAdmin",method = RequestMethod.GET)
	public String viewProductAdmin(Model mm, Product pp) {
		List<Product> listOfProducts = productService.findAllProduct();
		mm.addAttribute("product", listOfProducts);
		List<Category> listOfCategory = categoryService.findAllCategory();
		mm.addAttribute("category",listOfCategory);
		System.out.println(pp); 
		return "viewProduct";
	}
	
	@RequestMapping(value = "/openUpdateForm/{pid}",method = RequestMethod.GET)
	public String openUpdateForm(@PathVariable("pid") int pid, Model mm) { // DI for Product 
		Product product = productService.findProductById(pid);
		mm.addAttribute("product", product);		// store product object with name product 
		return "updateProduct";
	}
	
	
	@RequestMapping(value = "updateProduct",method = RequestMethod.POST)
	public String updateProduct(Model mm,Product product) {
		
		String result = productService.updateProduct(product);
		List<Product> listOfProduct = productService.findAllProduct();
		mm.addAttribute("msg", result);
		mm.addAttribute("products", listOfProduct);
		mm.addAttribute("product", product);
		return "viewProduct";
	}
	
	
	@RequestMapping(value = "/deleteProduct/{pid}",method = RequestMethod.GET)
	public String deleteProduct(@PathVariable("pid") int pid, Model mm,Product product) { // DI for Product 
		
		String result = productService.deleteProduct(pid);
		mm.addAttribute("msg", result);
		List<Product> listOfProduct = productService.findAllProduct();
		mm.addAttribute("products", listOfProduct);	// store list of product with name as products
		mm.addAttribute("product", product);		// store product object with name product 
		return "viewProduct";
	}
	
	
	@RequestMapping(value = "/placeOrder/{pid}",method = RequestMethod.POST)
	public String placeOrder(@PathVariable("pid") int pid, Model mm,Product product) { // DI for Product 
		
		String result = productService.placeOrder(product);
		List<Product> listOfProduct = productService.findAllProduct();
		mm.addAttribute("msg", result);
		mm.addAttribute("products", listOfProduct);
		mm.addAttribute("product", product);
		return "viewProductByCustomer";
	}
	
}
