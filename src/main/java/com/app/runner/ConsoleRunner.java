package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
  private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
	repo.save(new Product("AA",3.7));
	repo.save(new Product("BB",4.7));
	repo.save(new Product("CC",5.7));
		
	}

}
