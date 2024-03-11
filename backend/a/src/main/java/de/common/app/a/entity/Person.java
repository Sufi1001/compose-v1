package de.common.app.a.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "person")
public class Person  {


	
	@Id
	@GeneratedValue
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

	@Column(nullable = false)
	private String name;
	
	public Person(){};
	
	public Person(Integer id, String name) {
	    this.id = id;
	    this.name = name;
	};
}