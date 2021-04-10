package org.seleniumdemo.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumdemo.common.Wait;
 
public class HomePage {
   
   WebDriver driver;
   WebDriverWait wait;

   //Constructor that will be automatically called as soon as the object of the class is created
   public HomePage(WebDriver driver) {
      this.driver=driver;
   }
   
   //Locator for searchbox
   By searchBox = By.id("twotabsearchtextbox");

   // Locator for cart link
   By cart = By.id("nav-cart");
   

   public void waitProduct(By itemLocator) {
      WebDriverWait wait = new WebDriverWait(driver, Wait.EXPLICIT_WAIT);  
      wait.until(ExpectedConditions.visibilityOfElementLocated(itemLocator));
   }

   //Method to search
   public void searchText(CharSequence searchText) {
      driver.findElement(searchBox).sendKeys(searchText);
      driver.findElement(searchBox).sendKeys(Keys.ENTER);
   }


   public void viewCart() {
      waitProduct(cart);
      driver.findElement(cart).click();
   }
}