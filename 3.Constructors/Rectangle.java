import java.util.Scanner;

/* 

Design a class Rectangle with the following specifications :

Attributes :

length (double) : Represents the length of the rectangle
width (double) : Represents the width of the rectangle.
area (double) : Represents the area of rectangle.
Constructors :

A default constructor that initializes both length and width to 1.0
A parameterized constructor that takes two arguments to initialize length and width.
Methods :

void calculateArea() : Computes the area of rectangle.
void displayDetails() : Prints the rectangle's details, including its dimensions and area, in format specified below :
*/

class Rectangle {
  private double length;
  private double width;
  private double area;

  Rectangle() {
    this.length = 1.0;
    this.width = 1.0;
  }

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  void calculateArea() {
    this.area = this.length * this.width;
  }

  void displayDetails() {
    System.out.printf("Length : %.2f\n", this.length);
    System.out.printf("Width : %.2f\n", this.width);
    System.out.printf("Area : %.2f\n", this.area);
  }

  public static void main(String[] args) {

        // Create a Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        //Read th length ad width from the user as double input
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        // Create first object of rectangle class using the default constructor
        Rectangle r1 = new Rectangle();
        r1.calculateArea();
        r1.displayDetails();

        // Create second object of rectangle class using the parameterized constructor
        Rectangle r2 = new Rectangle(length, width);
        r2.calculateArea();
        r2.displayDetails();

        sc.close(); // Close the scanner
    }
}