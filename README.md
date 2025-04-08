# 🧪 QAFOX Selenium Automation Project

Welcome to the **QAFOX Selenium Project**, a structured and scalable automation framework created for testing the QAFOX demo e-commerce website.

This project is built using the **Page Object Model (POM)** design pattern and powered by **TestNG**, making it modular, maintainable, and reusable.

---

## 🔗 Project Repository

**👉 [GitHub Repository](https://github.com/vishnurag666/QAFOX_Selenium_Project.git)**

---

## 🌐 Project Under Test

**Website:** [QAFOX Demo Site](https://tutorialsninja.com/demo/)  
*(Used to validate various functionalities like user login, product search, cart operations, etc.)*

---

## 🚀 Features

✅ Automated end-to-end test cases  
✅ Follows Page Object Model (POM)  
✅ Clean test structure using TestNG  
✅ Assertions to validate expected outcomes  
✅ Scalable and modular design  
✅ Easy to maintain and extend

---

## 🛠️ Tech Stack Used

| Technology       | Purpose                          |
|------------------|----------------------------------|
| **Java**         | Programming language             |
| **Selenium WebDriver** | Automating browser interactions |
| **TestNG**       | Test framework and reporting     |
| **Page Object Model** | Design pattern for clean test structure |
| **Maven**        | Build and dependency management  |
| **Extent Reports (optional)** | Rich HTML reporting (can be added) |
| **GitHub**       | Version control & code hosting   |

---

## 📁 Project Structure

QAFOX_Selenium_Project 

├── logs/                      # Directory for log files
├── src/
│   └── test/
│       ├── java/
│       │   ├── pageObjects/   # Page classes for each module (e.g., LoginPage, HomePage)
│       │   ├── testCases/     # TestNG classes containing test methods
│       │   └── utilities/     # Reusable utilities and helper classes
│       └── resources/         # Configuration files (e.g., test data, properties files)
├── target/                    # Compiled bytecode and build artifacts
├── test-output/               # TestNG-generated reports and output files
├── .classpath                 # Eclipse-specific classpath settings
├── .project                   # Eclipse project file
├── Parallel.xml               # TestNG suite file for parallel execution
├── master.xml                 # Main TestNG suite file
└── pom.xml                    # Maven Project Object Model file
