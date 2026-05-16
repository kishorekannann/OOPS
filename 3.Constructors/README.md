# Constructor in Java

## Definition

A **constructor** in Java is a special member function of a class that is automatically called when an object is created. It initializes the data members of the class and prepares the object for use.

### Key Points

- ✅ The constructor name must be exactly the same as the class name
- ✅ It does not have any return type (not even `void`)
- ✅ It runs automatically when the object is created
- ✅ If no constructor is written, the compiler generates a default constructor, but it does NOT automatically initialize most attributes

---

## Purpose of Constructor

Constructors serve three major purposes:

1. **Object Initialization** — Assigns default or user-defined values to object attributes during creation
2. **Code Reusability** — Eliminates the need to write multiple lines of initialization code for each object
3. **Ensures Default Value** — Guarantees that the object starts in a valid state with either Java's default or programmer-defined values

---

## Types of Constructors

There are three different types of constructors:

- **Non-parameterized Constructor** — No parameters
- **Parameterized Constructor** — Accepts one or more parameters
- **Copy Constructor** — Copies values from another object

---

## Constructor Overloading

Constructor overloading occurs when a class has more than one constructor with different parameter lists or parameter types. This allows objects to be initialized in different ways depending on the parameters provided at object creation.

### Example: Constructor Overloading

\`\`\`java
import java.util.*;

class Employee {
    public String employeeName; // To store the name of the employee
    public int salary;          // To store the salary of the employee

    // Default Constructor
    public Employee() {
        this.employeeName = "Unknown";
        this.salary = 0;
    }

    // Constructor with one parameter
    public Employee(String employeeName) {
        this.employeeName = employeeName;
        this.salary = 0; // Default salary
    }

    // Constructor with two parameters
    public Employee(String employeeName, int salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

// Main Class
class Main {
    public static void main(String[] args) {
        // Using Default Constructor
        Employee emp1 = new Employee();
        System.out.println("Details of Employee 1 (Default Constructor):");
        emp1.displayDetails();

        System.out.println(); // Line break for clarity

        // Using Constructor with one parameter
        Employee emp2 = new Employee("Raj");
        System.out.println("Details of Employee 2 (One Parameter Constructor):");
        emp2.displayDetails();

        System.out.println(); // Line break for clarity

        // Using Constructor with two parameters
        Employee emp3 = new Employee("Rahul", 5000);
        System.out.println("Details of Employee 3 (Two Parameters Constructor):");
        emp3.displayDetails();
    }
}
\`\`\`

---

## Constructor Chaining in Java

Constructor chaining is a technique where one constructor calls another constructor of the same class to reuse initialization logic. This improves code reuse, maintainability, and consistency by eliminating repeated initialization code.

> **Note:** In Java, constructor chaining is achieved using the \`this()\` keyword to call another constructor in the same class.

### Key Points

- ✅ The \`this()\` call must always be the **first statement** in the constructor
- ✅ The chaining stops when the constructor without a \`this()\` call (usually with the least parameters) is invoked
- ✅ There is no limit on the chain length in constructor chaining

### When to Use Constructor Chaining

Constructor chaining is particularly useful when:

- Multiple constructors are needed for different initialization scenarios
- Common initialization code is repeated across multiple constructors
- Default values are used in multiple constructors

---

## Comparison: Without vs With Constructor Chaining

### ❌ Without Constructor Chaining (Code Duplication)

\`\`\`java
class Employee {
    String name;
    int salary;

    Employee() {
        name = "Unknown";
        salary = 0;
    }

    Employee(String n) {
        name = n;
        salary = 0;
    }

    Employee(String n, int s) {
        name = n;
        salary = s;
    }
}
\`\`\`

**Problem:** Initialization logic is repeated in multiple constructors.

### ✅ With Constructor Chaining (DRY Principle)

\`\`\`java
class Employee {
    String name;
    int salary;

    // Main constructor with all parameters
    Employee(String n, int s) {
        name = n;
        salary = s;
    }

    // Constructor chaining - delegates to main constructor
    Employee(String n) {
        this(n, 0);
    }

    // Constructor chaining - delegates to one-parameter constructor
    Employee() {
        this("Unknown", 0);
    }
}
\`\`\`

**Benefits:**
- ✅ Avoids code duplication
- ✅ Single source of truth for initialization logic
- ✅ Easier to maintain and modify
- ✅ Follows the DRY (Don't Repeat Yourself) principle
