package com.ustglobal.springassessment.service;

import java.util.List;

import com.ustglobal.springaqssessment.bean.OrderProduct;
import com.ustglobal.springaqssessment.bean.Product;
import com.ustglobal.springaqssessment.bean.User;

public interface ProductService {
	public User login(String email,String password);
	public boolean register(User user);
	public Product search(String pname);
	public boolean updatePassword(String email,String password);
	public List<OrderProduct> getProducts(String email);
	public boolean buyProduct(User user,Product product,int quantity);

}
