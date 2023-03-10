package com.soumya.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soumya.spring.springorm.product.dao.ProductDao;
import com.soumya.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/soumya/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		/*
		 * Product product = new Product(); product.setId(1);
		 * product.setName("Iphone"); product.setDesc("Its awesome!!");
		 * product.setPrice(800); productDao.create(product);
		 * productDao.update(product); productDao.delete(product);
		 */

		//Product product = productDao.find(1);
		List<Product> products = productDao.findAll();

		System.out.println(products);

	}

}
