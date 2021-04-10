package org.seleniumdemo.pageobject;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumdemo.common.Wait;
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
    By addButton = By.cssSelector("[id='add-to-cart-button']");
    By closeSidePanel = By.cssSelector("[data-cart-type='Retail_Cart']");
    

    public void waitProduct(By selector) {
        this.wait = new WebDriverWait(driver, Wait.EXPLICIT_WAIT);  
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    }
    
    //Method to click on Logout button
    public void clickAddCart() {
        waitProduct(addButton);
        driver.findElement(addButton).click();
        waitProduct(closeSidePanel);
    }
}
