package com.sound.SpringBoot1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sound.SpringBoot1.model.Customer;
import com.sound.SpringBoot1.model.Product;
import com.sound.SpringBoot1.model.login;
import com.sound.SpringBoot1.service.CustomerService;
import com.sound.SpringBoot1.service.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	 private CustomerService  customerService;
	
	@Autowired
	 private ProductService  productService;
	@GetMapping("/test")
	public ModelAndView getHomePage() {
		ModelAndView modelAndView = new ModelAndView("index");
		
		 modelAndView.addObject("username","hiiii");
		 return  modelAndView;
	}
	@GetMapping("/dashboard")
	public ModelAndView getDashboardPage() {
		ModelAndView modelAndView = new ModelAndView("dashboard");
		
		List<Product>allProducts =productService.getAllProducts();
		
		 modelAndView.addObject("allProducts",allProducts);
		 return  modelAndView;
	}
	@GetMapping("/login")
	public ModelAndView getLoginPage() {
		ModelAndView modelAndView = new ModelAndView("login");
		
		 
		 return  modelAndView;
	}
	@PostMapping("/login")
	public String doLogin(login login) {
		
		 boolean isLogin= customerService.validate(login);
		if(isLogin) {
			return "redirect:/dashboard";
		}else {
	
		 return  "redirect:/login";
	}
	}
	@GetMapping("/register")
	public ModelAndView getRegisterPage() {
		ModelAndView modelAndView = new ModelAndView("register");
		
		 
		 return  modelAndView;
	}
	@PostMapping("/register")
	public String doRegistration(Customer customer) {
		customerService.add(customer);
		
	
		 return  "redirect:/login";
	}
	
}
