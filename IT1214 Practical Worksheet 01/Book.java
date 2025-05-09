class Book {
 private String title;
 private String author;
 private double price;
 
 
 Book(String title, String author, double price) {
	 this.title = title;
        this.author = author;
        this.price = price;
 // Initialize all attributes
 }
 Book(String title, String author) {
	   this.title = title;
        this.author = author;
        this.price = 0;
 // Initialize with price = 0
 }
 }