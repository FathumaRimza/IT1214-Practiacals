 class Vehicle {
 String brand;
 int speed;
 void display() {
	  System.out.println("Brand: " + brand + ", Speed: " + speed);
 // Display vehicle details
 }
 
 class Car extends Vehicle {
 String model;
 @Override
 void display() {
	  System.out.println("Brand: " + brand + ", Speed: " + speed + ", Model: " + model);
    }
 // Display car details including brand, speed, and model
 }
 }