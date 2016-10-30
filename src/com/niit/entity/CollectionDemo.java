package com.niit.entity;
import java.util.*;
import com.niit.entity.Product;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Product> products=new ArrayList<>();
		Product p= null;
		p= new Product();
		p.getProductId();
		p.setProductId(1);
		p.getCategoryId();
		p.setCategoryId(1);
		p.getSupplierId();
		p.setSupplierId(1);
		p.getName();
		p.setName("Mobile.");
		p.getDescription();
		p.setDescription("This is mobile.");
		p.getUnitPrice();
		p.setUnitPrice(6650);
		p.getQuantity();
		p.setQuantity(1);
		

	}

}
