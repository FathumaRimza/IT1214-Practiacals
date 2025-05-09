 class Employee {
 String name;
 int id;
 double salary;
 Employee(String name, int id, double salary) {
 // Initialize attributes
 }
 void displayDetails() {
	   this.name = name;
        this.id = id;
        this.salary = salary;
 // Display employee details
 }
    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
 }
 }
 class Manager extends Employee {
 Manager(String name, int id, double salary) {
 super(name, id, salary);
 }
 @Override
 void displayDetails() {
	 super.displayDetails();
        System.out.println("Bonus: " + (salary * 0.1));
 // Display employee details and bonus
 }
 }