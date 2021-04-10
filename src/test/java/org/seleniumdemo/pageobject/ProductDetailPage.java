package org.seleniumdemo.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumdemo.common.Wait;
 
public class ProductDetailPage {
    
    WebDriver driver;
    WebDriverWait wait;
 
    //Constructor that will be automatically called as soon as the object of the class is created
    public ProductDetailPage(WebDriver driver) {
        this.driver=driver;
    }
    
    //Locators for 'Add to Cart' button and 'Side Panel'
    By addButton = By.cssSelector("[id='add-to-cart-button']");
    By sidePanel = By.cssSelector("[data-cart-type='Retail_Cart']");
    

    public void waitProduct(By selector) {
        this.wait = new WebDriverWait(driver, Wait.EXPLICIT_WAIT);  
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    }
    
    //Method : click to add a product
    public void clickAddCart() {
        waitProduct(addButton);
        driver.findElement(addButton).click();
        waitProduct(sidePanel);
    }
}
