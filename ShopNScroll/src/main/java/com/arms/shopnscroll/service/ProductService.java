package com.arms.shopnscroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arms.shopnscroll.daoimpl.ProductDAOImpl;
import com.arms.shopnscroll.model.Product;

@Service
@Transactional
public class ProductService 
{
	
@Autowired
	ProductDAOImpl productDAOImpl;
	
	public List<Product> fetchAllProduct()
	{
		return productDAOImpl.fetchAllProduct();
	}
	public Product fetchOneProduct(int productId)
	{
		return productDAOImpl.fetchOneProduct(productId);
	}
	
	public void addProduct(Product product)
	{
		productDAOImpl.addProduct(product);
	}
	public void removeProduct(int productId)
	{
		productDAOImpl.removeProduct(productId);
	}
}