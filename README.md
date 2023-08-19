# Student_Records_Hibernate

This repository demonstrates the usage of Hibernate, a robust Object-Relational Mapping (ORM) framework for Java applications. The project showcases a basic Hibernate configuration and a fundamental database operation: inserting a student record into a database table.

# Prerequisites
Before running this project, please ensure that you have the following prerequisites installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Hibernate
- MySQL (or any other relational database of your choice)
- IDE (Eclipse, IntelliJ IDEA, etc.) - Optional

# Getting Started
To set up and run the project, follow these steps:

1. Clone this repository to your local machine:
-> git clone https://github.com/ShraddhaGhawalkar/Student_Records_Hibernate.git

2. Open the project in your preferred IDE (if using one).

3. Configure Hibernate:

- Navigate to the src directory and open hibernate.cfg.xml.
- Update the database connection settings (e.g., URL, username, and password) to match your database setup.
  
4. Build the project using Maven:
   mvn clean install
5. Run the Studentmain class as a Java application to insert a student record into the database.

6. Verify in your database that the student record has been successfully inserted.

# Project Structure
- hibernate.cfg.xml: Hibernate configuration file that specifies database connection details and mapping configurations.
- src/main/java/hibernatepack/Studentmain.java: The main Java class that demonstrates Hibernate usage by inserting a student record into the database.
- src/main/java/hibernatepack/Student.java: A simple Java class representing a Student entity with properties for roll, name, and address.

# How It Works
- The hibernate.cfg.xml file is used to configure Hibernate, including database connection settings and mapping configurations.
- In the Studentmain class, we create a Hibernate SessionFactory based on the configuration.
- We open a Hibernate Session to interact with the database.
- A Transaction is initiated to ensure data consistency.
- We create a Student object, set its attributes, and use session.persist(s) to insert it into the database.
- The transaction is committed, and the session is closed.
- A success message is printed to the console.
