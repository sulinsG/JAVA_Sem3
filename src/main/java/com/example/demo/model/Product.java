package com.example.demo.model;

public class Product {
	//1.mainigie
	private String title;
	private String description;
	private float price;
	private int quantity;
	
	//2.get un set funkcijas
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	//3.1 bezarg konstruktors
	public Product()
	{
		
	}
	//3.2. arg konstruktors
	public Product(String title, String description, float price, int quantity) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [title=" + title + ", description=" + description + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
}
