package com.example.obrestejerciciosdatajpa;

import com.example.obrestejerciciosdatajpa.entities.Laptop;
import com.example.obrestejerciciosdatajpa.repositories.LaptopResponsitory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObRestEjerciciosdatajpaApplication {

	public static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(ObRestEjerciciosdatajpaApplication.class, args);
	LaptopResponsitory responsitory = context.getBean(LaptopResponsitory.class);

		Laptop laptop1 = new Laptop(null, "HP","PAVILON", "INTEL i7",700.99);
		Laptop laptop2 = new Laptop(null, "HUAWEI", "D14", "RYZEN 5", 799.99);

		responsitory.save(laptop1);
		responsitory.save(laptop2);

		System.out.println(responsitory.findAll().size());
	}

}
