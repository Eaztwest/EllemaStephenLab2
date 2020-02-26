package com.motorcycle;

public class Motorcycle {
	//Properties
	protected String model;
	protected int year;
	protected String color;
	
	//Constructor
	public Motorcycle() {
		
	}
	
	public Motorcycle(String model) {
		this.model = model;
	}
	
	public Motorcycle(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
	public Motorcycle(String model, int year, String color) {
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	//Getter Methods
	public String getModel() {
		return this.model;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getColor() {
		return this.color;
	}
	
	//Methods
	public void horn() {
		System.out.println("Beep!");
	}
	
	public void engineSound() {
		System.out.println("Brap!");
	}
	
	public void displaySpecs() {
		System.out.println("Model: " + getModel());
		System.out.println("Year: " + getYear());
		System.out.println("Color: " + getColor());
	}
}
