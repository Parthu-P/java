package com.example.demo.binding;

import lombok.Data;

@Data
public class user {
	private Integer id;
	private String name;
	private  String city;
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
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public void setCity(String city) {
		this.city = city;
	}

}
