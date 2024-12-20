# Employee Management System

## Overview
The **Employee Management System** is a Java-based project designed to manage employee records, attendance, payroll, and department details effectively. The system incorporates multiple design patterns to ensure scalability, maintainability, and ease of use.

## Design Patterns Used

### 1. Singleton Pattern
- **Database Connection Manager**:
  - Ensures only one instance of the database connection exists.
  - Prevents the need to create multiple connections, optimizing resources and maintaining consistency.
- **Payroll System**:
  - Centralizes payroll processing, making it accessible throughout the application from a single instance.

### 2. Factory Pattern
- **Employee Factory**:
  - Creates objects for different employee types such as Full-time, Part-time, and Contractor.
  - Simplifies the instantiation process by encapsulating the creation logic.
- **Department Factory**:
  - Instantiates objects for various departments like HR, Finance, and IT.
  - Enhances flexibility and modularity when adding or modifying departments.

### 3. Builder Pattern
- **Contractor Class**:
  - Provides a streamlined way to construct Contractor objects with customizable parameters.
  - Facilitates the creation of objects with only the attributes needed at the time.

### 4. Prototype Pattern
- **Contractor Class**:
  - Enables the creation of new Contractor objects by cloning existing ones.
  - Reduces overhead by reusing object properties, improving efficiency when creating similar objects.

### 5. Adapter Pattern
- **Employee Adapter**:
  - Adapts objects to behave as Employee instances.
  - Simplifies access to Employee methods and ensures compatibility with the system.

### 6. Proxy Pattern
- **Instance Control**:
  - Restricts object creation to administrators only.
  - Adds an extra layer of control and security over system operations.

## Features
- Centralized payroll management.
- Easy creation and management of employee types and departments.
- Streamlined and flexible object construction for contractors.
- Efficient object reuse and adaptation.
- Controlled and secure access to object creation.

## How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/yous0001/Employee-managment-system-java
   ```
2. Open the project in your preferred Java IDE.
3. Build and run the project.

## Contribution
Contributions are welcome! If you have suggestions or want to enhance the project, feel free to submit a pull request.

## License
This project is licensed under the [MIT License](LICENSE).

