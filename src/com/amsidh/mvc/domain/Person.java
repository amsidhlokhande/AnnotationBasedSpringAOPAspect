package com.amsidh.mvc.domain;

import com.amsidh.mvc.annotation.Loggable;

public class Person {

	private Integer personId;
	private String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Integer personId, String name) {
		super();
		this.personId = personId;
		this.name = name;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
    @Loggable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
