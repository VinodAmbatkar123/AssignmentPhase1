package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Product;

public class App {
	public static void main(String[] args) {
		Configuration con=new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session s= sf.openSession();
		
		Product s1= new Product();
		s1.setPname("Addidas Sneaker");
		s1.setPdescription("White,High top,leather");
		s1.setPprice(7520.49);
		s.save(s1);
	}

}