package org.seleniumdemo.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumdemo.common.Wait;

 
// '[data-name="Active Items"] .sc-list-item'
public class CartPage {
    WebDriver driver;
    WebDriverWait wait;
 
    //Constructor that will be automatically called as soon as the object of the class is created
    public CartPage(WebDriver driver) {
        this.driver=driver;
    }
    
    //Locators for the page title and the logout button
    By listItem = By.cssSelector("[data-name='Active Items'] .sc-list-item");
    

    public void waitProduct(By selector) {
        this.wait = new WebDriverWait(driver, Wait.EXPLICIT_WAIT);  
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    }
    
    //Method to click on Logout button
    public int verifyCart() {
        waitProduct(listItem);
        int itemsNumber =  driver.findElements(By.cssSelector("[id='sc-active-cart'] .sc-list-item")).size();
        return itemsNumber;
    }
}
