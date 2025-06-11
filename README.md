# Selenium Java Automation Framework using POM

This project is a basic Selenium Automation Framework built using **Java + TestNG + Maven** with the **Page Object Model (POM)** design pattern.

It's like a starter kit for automating any website login or form — built to keep things clean and reusable.

---

## What's POM (Page Object Model)?

Page Object Model is just a way to keep your code clean and neat.

- Every page of your website = 1 Java class (called a "Page Object")
- All locators (like buttons, text boxes) + actions (click, type, etc.) go inside that class
- So if UI changes, you only update in one place, not in every test.

Example:
```java
public class LoginPage {
    WebDriver driver;
    
    By emailField = By.id("email");
    By passwordField = By.id("pass");
    By loginBtn = By.id("login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String pwd) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(pwd);
        driver.findElement(loginBtn).click();
    }
}

