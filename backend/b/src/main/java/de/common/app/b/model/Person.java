package de.common.app.b.model;

public class Person {

	private Integer  id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public Person(){};
	
	public Person(Integer id, String name) {
	    this.id = id;
	    this.name = name;
	};
}