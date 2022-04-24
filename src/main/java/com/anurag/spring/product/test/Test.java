package com.anurag.spring.product.test;

import com.anurag.spring.product.dao.ProductDao;
import com.anurag.spring.product.entity.Product;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/product/test/config.xml");

        ProductDao dao = (ProductDao) ctx.getBean("productDao");

        Product product = new Product();
        product.setId(1);
        product.setName("iPhone");
        product.setDesc("It's awesome!!");
        product.setPrice(700);
        
        dao.create(product);

        ctx.close();
    }
}
