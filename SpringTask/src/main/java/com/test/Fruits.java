package com.test;

public class Fruits {

	private String name;
	private int price;
	private int qnty;
	private String color;
	
	public Fruits()
	{
		
	}

	public Fruits(String name, int price, int qnty, String color) {
		super();
		this.name = name;
		this.price = price;
		this.qnty = qnty;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQnty() {
		return qnty;
	}

	public void setQnty(int qnty) {
		this.qnty = qnty;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruits [name=" + name + ", price=" + price + ", qnty=" + qnty + ", color=" + color + "]";
	}
	
}
