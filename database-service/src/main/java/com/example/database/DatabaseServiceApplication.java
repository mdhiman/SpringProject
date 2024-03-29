package com.example.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseServiceApplication.class, args);
	}
	
	private static final Logger log = LoggerFactory.getLogger(DatabaseServiceApplication.class);
	
	@Autowired
	private BookRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		repository.save(new Book("Java"));
		repository.save(new Book("DSA"));
		repository.save(new Book("Scala"));
		repository.save(new Book("Algorithm"));
		repository.save(new Book("PySpark"));
		repository.save(new Book("Kafka"));
		
		System.out.println("\n Find all Records");
		
		repository.findAll().forEach(x-> System.out.println(x));
		
		
	}

}
