class Rectangle {
 private int length;
 private int breadth;
 Rectangle() {
	 this.length=0;
	 this.breadth=0;
 // Default constructor
 }
 Rectangle(int length, int breadth) {
	  this.length = length;
        this.breadth = breadth;
 // Parameterized constructor
 }
 public int area() {
	 return length*breadth;
 // Calculate and return area
 }
 }