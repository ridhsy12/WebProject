package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    private WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String name) {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys(name);
    }

    public void setEmail(String email) {
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(email);
    }

    public void setComments(String comments) {
        WebElement commentsField = driver.findElement(By.id("comments"));
        commentsField.sendKeys(comments);
    }

    public void submitForm() {
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
    }
}
