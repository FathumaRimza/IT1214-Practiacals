 class Student {
 private String name;
 private int rollNo;
 private String course;
 // Constructor
 Student(String name, int regNo, String course) {
 this.name=name;
 this.rollNo=rollNo;
 this.course=course;
 // Initialize attributes
 }
 // Getters and Setters
 public String getName() { return name; }
 public void setName(String name) { this.name=name; }
  public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
 
// Complete other getters and setters
 public String display() {
	   return "Name: " + name + ", Roll No: " + rollNo + ", Course: " + course;
 // Display student details
 }
 }