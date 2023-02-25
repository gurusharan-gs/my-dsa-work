package com.example;

public class Car implements Vehicle, Bike{

	@Override
	public void gearChange() {
		System.out.println("gear change");
	}
	
	// this is example of method overriding
	public static void main(String[] args) {
		Car car = new Car();
//		car.startVehicle();
//		car.gearChange();
//		car.stopVehicle();
		
	}

}
