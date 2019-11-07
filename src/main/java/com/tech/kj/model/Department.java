package com.tech.kj.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department implements Serializable{
	@Id
	private String id;
	@Column(name="department_name")
	private String departmentName;
	
	
	@OneToMany(mappedBy="department")
	private List<Employee> employees;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	
	
	
	
}
