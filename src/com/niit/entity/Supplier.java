package com.niit.entity;

public class Supplier {
	private int id;
	private String name;
	private double rating;
	private String email;
	private String contact_no;

	public int getId() {
		return this.id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return this.contact_no;
	}

	public void setContactNo(String contact_no) {
		this.contact_no = contact_no;
	}

}
