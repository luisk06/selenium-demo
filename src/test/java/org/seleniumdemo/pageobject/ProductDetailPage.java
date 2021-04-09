package org.seleniumdemo.pageobject;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class ProductDetailPage {
    
    WebDriver driver;
    WebDriverWait wait;
 
    //Constructor that will be automatically called as soon as the object of the class is created
    public ProductDetailPage(WebDriver driver) {
        this.driver=driver;
    }
    
    //Locators for the page title and the logout button
    By addButton = By.cssSelector("[id='buyBoxAccordion'] .a-button-stack");
    

    public void waitProduct() {
        this.wait = new WebDriverWait(driver, 15);  
        wait.until(ExpectedConditions.visibilityOfElementLocated(addButton));
    }
    
    //Method to click on Logout button
    public void clickAddCart() {
        waitProduct();
        driver.findElement(addButton).click();
    }
}
