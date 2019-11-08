package com.tech.kj;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.ConfigurableApplicationContext;

import com.tech.kj.model.Employee;
import com.tech.kj.repository.EmployeeRepository;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext= SpringApplication.run(DemoApplication.class, args);
		DemoApplication demo=applicationContext.getBean(DemoApplication.class);
		demo.save();
	}
	
	public void save() {
		Employee employee=new Employee();
		employee.setFirstName("K");
		employee.setLastName("J");
		employeeRepository.save(employee);
		System.out.println(employee.getId());
	}

}