# Login Automation Test Suite

This project contains automated test cases for the login functionality of the application "Germany Is Calling." The tests validate various login scenarios, including successful logins, unsuccessful attempts, and edge cases using Selenium WebDriver, TestNG, and ExtentReports.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Test Cases and Results](#test-cases-and-results)
- [Test Report](#test-report)
- [Execution Steps](#execution-steps)

## Prerequisites

Before running the test scripts, ensure the following tools and dependencies are installed on your system:

- **Java Development Kit (JDK)**: Version 8 or later.
- **Maven**: For managing project dependencies and running tests.
- **IntelliJ IDEA**: Recommended IDE for Java development.
- **Git**: For cloning the repository.

## Project Structure

Here is an overview of the project structure:

![image](https://github.com/user-attachments/assets/4795bcc9-730b-48af-824d-4cc416638ff7)

## Test Cases and Results

# Test Case 1: Account Creation with Valid Details<br>

Description: Tests the creation of a new account using valid details.

![image](https://github.com/user-attachments/assets/6fc4e61a-2b7a-4259-aa9c-afee2ea896c9)

Expected Output: Account is successfully created, and the user is redirected to the welcome page.

![image](https://github.com/user-attachments/assets/8dfacd33-10aa-4300-a590-640d038f1e7d)

Actual Output: Passed as expected.

# Test Case 2: Login with Valid Details<br>

Description: Tests logging in with valid credentials.

![image](https://github.com/user-attachments/assets/dcd4566c-acc9-4208-84ad-d0d5b25021ff)


Expected Output: User is logged in, and the home page is displayed with the correct title.

![image](https://github.com/user-attachments/assets/2cbd5316-a548-4f34-a0ee-b7c820279a9c)

Actual Output: Passed as expected.

# Test Case 3: Login with Invalid Details<br>

Description: Tests logging in with incorrect credentials (invalid email and password).

![image](https://github.com/user-attachments/assets/e1ea724c-2f9e-4730-9e9d-1c7b3fbc3873)

Expected Output: An error message is displayed stating "Invalid credentials."

![image](https://github.com/user-attachments/assets/57dcdb96-aada-44ae-b28e-51868155f00c)

Actual Output: Passed, error message displayed correctly.

# Test Case 4: Login with Empty Fields<br>

Description: Tests logging in without entering any credentials.

![image](https://github.com/user-attachments/assets/6d7287b7-0a64-4779-8680-3a4ff235ae28)

Expected Output: An error message indicating that fields cannot be empty is displayed.

![image](https://github.com/user-attachments/assets/bca13a67-bb8a-4055-a440-743681f6fdad)

Actual Output: Passed as expected.

# Test Case 5: Login with Empty Password<br>

Description: Tests logging in with a username but without a password.

![image](https://github.com/user-attachments/assets/0b1e7ea2-e2eb-44c2-ab9f-20d34ec98844)

Expected Output: An error message indicating that the password is required is displayed.

![image](https://github.com/user-attachments/assets/e061d414-e09c-46f4-afee-c9d6d4cccffa)

Actual Output: Passed as expected.





