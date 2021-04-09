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
import org.seleniumdemo.pageobject.*;
 
public class HomePage {
 
   WebDriver driver;
   WebDriverWait wait;

 //Constructor that will be automatically called as soon as the object of the class is created
 public HomePage(WebDriver driver) {
    this.driver=driver;
 }
 
 // Set wait limit
 // WaitPageElement waitFor = new webpage
 WaitPageElement waitFor = new WaitPageElement(driver, wait);

 //Locator for searchbox
 By searchBox = By.id("twotabsearchtextbox");

 //
 By cart = By.id("nav-cart");
 

 public void waitProduct(By itemLocator) {
   WebDriverWait wait = new WebDriverWait(driver, 15);  
   wait.until(ExpectedConditions.visibilityOfElementLocated(itemLocator));
}

 //Method to search
 public void searchText(CharSequence searchText) {
    driver.findElement(searchBox).sendKeys(searchText);
    driver.findElement(searchBox).sendKeys(Keys.ENTER);
 }


 public void viewCart() {
   
    System.out.println("hello prev: " + cart);
   waitProduct(cart);
   waitFor.waits(cart, driver, wait);
    driver.findElement(cart).click();
 }
}