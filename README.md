# Online Payment System — Strategy Design Pattern

A Java-based console application that simulates an online payment system, built as a practical demonstration of the **Strategy Design Pattern**. The project showcases how payment methods can be selected and swapped at runtime without modifying the core application logic.

---

## Overview

This project implements a flexible payment processing system where the payment algorithm (Credit Card, UPI, or PayPal) is encapsulated as an interchangeable strategy. The system allows users to choose their preferred payment method at runtime, process transactions, and perform multiple payments in a single session.

---

## Design Pattern

The **Strategy Pattern** is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. In this project:

- **`PaymentStrategy`** — The common interface that all payment methods implement.
- **`PaymentContext`** — Holds a reference to the active strategy and delegates payment processing to it.
- **`PaymentFactory`** — Creates the appropriate strategy object based on user input.
- **Concrete Strategies** — `CreditCardPayment`, `UPIPayment`, and `PaypalPayment` each implement the strategy interface independently.

This separation means new payment methods can be added in the future without touching the existing codebase.

---

## Project Structure

```
Strategy_DesignPattern_TA/
├── PaymentStrategy.java       # Strategy interface
├── PaymentContext.java        # Context class that uses the strategy
├── PaymentFactory.java        # Factory for creating strategy instances
├── CreditCardPayment.java     # Concrete strategy: Credit Card
├── UPIPayment.java            # Concrete strategy: UPI
├── PaypalPayment.java         # Concrete strategy: PayPal
└── Main.java                  # Entry point with interactive console menu
```

---

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher

### Run the Application

```bash
# Clone the repository
git clone https://github.com/Yugant-S/Strategy_DesignPattern_TA.git
cd Strategy_DesignPattern_TA

# Compile all Java files
javac *.java

# Run the application
java Main
```

---

## Usage

On startup, the application presents an interactive menu:

```
========================================
 Welcome to the Online Payment System
========================================

Select Payment Method:
 1. Credit Card
 2. UPI
 3. PayPal
 0. Exit

Enter your choice:
```

The user selects a payment method, enters an amount (in ₹), and the corresponding strategy processes the payment. The session continues until the user chooses to exit.

---

## Key Concepts Demonstrated

- **Open/Closed Principle** — The system is open for extension (new payment strategies) but closed for modification.
- **Runtime Polymorphism** — The active payment strategy can be swapped dynamically via `PaymentContext.setStrategy()`.
- **Factory Pattern** — `PaymentFactory` decouples strategy instantiation from the main application logic.
- **Input Validation** — The application handles invalid menu choices and non-numeric amounts gracefully.

---

## Technologies

- **Language:** Java
- **Paradigm:** Object-Oriented Programming
- **Pattern:** Strategy + Factory

---

## Author
**Vivek Gupta**
