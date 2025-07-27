# Console‑Apps

A collection of simple Java console applications.

## Table of Contents

* [About](#about)
* [Prerequisites](#prerequisites)
* [Installation](#installation)
* [Usage](#usage)
* [Available Applications](#available-applications)
* [Project Structure](#project-structure)
* [Contributing](#contributing)
* [License](#license)

## About

This repository contains a set of Java console applications developed as practice exercises. Each application demonstrates basic Java programming concepts, user input handling via `Scanner`, control flow, and simple logic.

## Prerequisites

* Java Development Kit (JDK) 8 or higher
* Apache Maven (optional, for build management)

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/AbdallahAwaysheh/Console-Apps.git
   cd Console-Apps
   ```
2. (Optional) Build with Maven:

   ```bash
   mvn clean compile
   ```

## Usage

You can run the applications either through your IDE or via the command line.

**Using Maven Exec Plugin**:

```bash
mvn exec:java -Dexec.mainClass="org.abdallah.Main"
```

**Using the Java CLI**:

```bash
javac -d out src/main/java/org/abdallah/*.java
java -cp out org.abdallah.Main
```

After launching, the **Main** class presents a menu to select and run any of the available console apps.

## Available Applications

* **Calculator**: Perform basic arithmetic operations (`+`, `-`, `*`, `/`, `^`)
* **Weight Converter**: Convert between kilograms and pounds
* **Temperature Converter**: Convert between Celsius and Fahrenheit
* **Guess The Number Game**: Guess a randomly generated number within a range
* **Shopping Cart**: Add items with prices to a cart and display the total
* **Banking Application**: Simple banking operations (deposit, withdraw, check balance)
* **Main Menu**: Launcher that lets you choose any of the above

## Project Structure

```
Console-Apps/
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── abdallah/
│                   ├── Main.java
│                   ├── Calculator.java
│                   ├── WeightConverter.java
│                   ├── TempConverter.java
│                   ├── GuessTheNumber.java
│                   ├── ShoppingCart.java
│                   └── BankingApplication.java
├── pom.xml
└── LICENSE
```

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

