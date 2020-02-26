package com.motorcycle;

public class BigBike extends Motorcycle {
	//Properties
	private int topSpeed;
	private String transmission;
	
	//Constructor
	public BigBike() {
		
	}
	
	public BigBike(String model, int year, String color) {
		super(model, year, color);
	}
	
	public BigBike(String model, int year, String color, String transmission, int topSpeed) {
		super(model, year, color);
		this.transmission = transmission;
		this.topSpeed = topSpeed;
	}
	
	//Getter Methods
	public int getTopSpeed() {
		return this.topSpeed;
	}
	
	public String getTransmission() {
		return this.transmission;
	}  
	
	//Methods
	public void horn() {
		System.out.println("BEEEEEEEEEEP BEEEEEEEEP!"); // Method Overriding
	}
	
	public void engineSound(int revNumber) { // Method Overloading
		for(int i = 0; i < revNumber; i++) {
			System.out.print("BRAP! ");
		}
	}
	
	public void displaySpecs() { // Method Overriding
		System.out.println("Model: " + getModel());
		System.out.println("Year: " + getYear());
		System.out.println("Color: " + getColor());
		System.out.println("Transmission: " + getTransmission());
		System.out.println("Top Speed: " + getTopSpeed());
	}
}
