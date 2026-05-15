# Attributes and Methods

## Attributes

Attributes (also called *properties* or *fields*) are the data or characteristics of an object. They represent the state of the object at any given moment. Attributes are typically defined within a class and can hold different types of information related to the object.

For example, consider two data fields for a `BankAccount` class:

- **Name**: stores the name of the account holder. Use the `String` data type.
- **Balance**: stores the account balance. Use the `double` data type.

## Methods

Methods are functions defined inside a class that represent the behavior or actions an object can perform. Methods operate on attributes (fields) and define what an object can do. Every object of a class can call the class methods to perform specific tasks.

For example, a `BankAccount` class might provide the following methods:

- **checkBalance()** — The user can check the account balance.
- **deposit(amount)** — The user can deposit a certain amount.
- **withdraw(amount)** — The user can withdraw money from the account.

## Interaction Between Attributes and Methods

In real-world classes, attributes and methods interact constantly. Methods provide controlled access to attributes. Often attributes are marked `private` to restrict direct access from outside the class (encapsulation). Methods then provide the controlled interface to those attributes.

For example, if the `balance` attribute is `private` in `BankAccount`, a method such as `getBalance()` is required to read it.

Two commonly used types of methods for accessing private attributes are:

- **Setters**: methods that set the value of an attribute (e.g., `setName(String name)`).
- **Getters**: methods that retrieve the value of an attribute (e.g., `getName()`).

These accessor methods are necessary because they allow controlled access to private data, preventing direct modification from outside the object.
