//Your code goes here

import java.util.Scanner;

class Student{
    private String name;
    private int rollNumber;

    public void setDetails(String name,int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.rollNumber);
    }
}


class Main {
    public static void main(String[] args) {
    
        // Create a Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine(); // Read the name as a string input

        int rollNumber = sc.nextInt(); // Read the roll number as an integer input

        // Create an object of the Student class
        Student student = new Student();

        // Set the details of the student using the setDetails() method
        student.setDetails(name, rollNumber);

        // Display the student's details using the displayDetails() method
        student.displayDetails();

        // Close the Scanner to free resources
        sc.close();
    }
}

