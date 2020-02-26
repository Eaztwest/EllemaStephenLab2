package com.motorcycle;

public class MotorcyleTest {

	public static void main(String[] args) {
		//Superclass
		Motorcycle m1 = new Motorcycle("Kawasaki H2");
		System.out.println(m1.getModel());
		
		m1 = new Motorcycle("Kawasaki H2", 2020); // Constructor Overloading
		System.out.println(m1.getModel() + " " +  m1.getYear());
		
		m1 = new Motorcycle("Kawasaki H2", 2020, "Black"); // Constructor Overloading
		System.out.println(m1.getModel() + " " + m1.getYear() + " " + m1.getColor()); //Usage of getter methods
		
		//Superclass Methods
		m1.horn();
		m1.displaySpecs();
		m1.engineSound();
		
		//Subclass
		BigBike b1 = new BigBike();
		b1 = new BigBike("Yamaha R1", 2020, "Blue");
		System.out.println(b1.getModel() + " " + b1.getYear() + " " + b1.getColor());
		
		b1 = new BigBike("Yamaha R1", 2020, "Blue", "Manual", 300); // Constructor Overloading
		System.out.println(b1.getModel() + " " + b1.getYear() + " " + b1.getColor() + " " + b1.getTransmission() + " " + b1.getTopSpeed()); // Usage of getter methods
		
		//Subclass Methods 
		b1.horn(); // EXAMPLE OF POLYMORPHISM
		b1.engineSound(5);
		b1.displaySpecs();
	}
}
