package com.example.demo;

import com.example.demo.beans.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoapplicationApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringdemoapplicationApplication.class, args);

		Student std = context.getBean(Student.class);
		std.display();
	}

}
