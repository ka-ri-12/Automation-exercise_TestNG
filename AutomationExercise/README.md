# Automation Exercise Project - TestNG

## Project Description
This project demonstrates the implementation of automation testing using the **TestNG framework**. It includes a set of test scenarios designed to validate various functionalities of a web application. The tests are organized and structured to ensure code reusability, scalability, and maintainability.

## Features
- Framework: TestNG
- Programming Language: Java
- Number of Test Scenarios: More than 10
- Key Features:
  - Organized test cases using annotations (`@Test`, `@BeforeMethod`, `@AfterMethod`)
  - Assertions to validate test results

## Requirements
1. **Java Development Kit (JDK)**: Version 8 or above
2. **TestNG**: Installed via Maven or IDE
3. **Maven**: To manage project dependencies
4. **IDE**: IntelliJ IDEA, Eclipse, or any Java-supported IDE
5. **Browser**: Chrome (or any other browser supported by the tests)

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/ka-ri-12/Automation-exercise_TestNG.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Automation-exercise_TestNG
   ```
3. Open the project in your preferred IDE.
4. Ensure Maven dependencies are downloaded by refreshing the project.

## How to Run Tests
1. Open the `testng.xml` file in the project.
2. Execute the test suite by:
   - Right-clicking the `testng.xml` file and selecting **Run** (in IDEs like IntelliJ or Eclipse), or
   - Running the following Maven command in the terminal:
     ```bash
     mvn test
     ```

## Project Structure
- **src/main/java**: Contains the main application code (if applicable)
- **src/test/java**: Contains test classes and methods for automation testing
- **testng.xml**: Configuration file for running test suites
- **pom.xml**: Maven Project Object Model file containing dependencies and build configuration

## Test Scenarios
The project includes automated test cases for the following scenarios:
1. Validating user login functionality
2. Testing form submissions
3. Verifying navigation across different web pages
4. Performing CRUD operations 
5. Ensuring error messages display correctly for invalid inputs

## Dependencies
1. **Selenium WebDriver**: For browser automation
2. **TestNG**: Testing framework
3. **Maven**: For managing dependencies and build lifecycle

## Contribution
If you'd like to contribute to this project:
1. Fork the repository.
2. Create a new branch for your feature or bug fix:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes and push to your forked repository.
4. Open a pull request explaining your changes.

## Author
**SK Karishma**

Feel free to reach out for any questions or suggestions!
