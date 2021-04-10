package org.seleniumdemo.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumdemo.common.Wait;
 
public class ResultsPage {
 
   WebDriver driver;
   WebDriverWait wait;
   
   //Constructor that will be automatically called as soon as the object of the class is created
   public ResultsPage(WebDriver driver) {
      this.driver=driver;
   }
   
   //Locator for element in product list
    By productList = By.cssSelector("[cel_widget_id='MAIN-SEARCH_RESULTS-1'] .a-link-normal");
   
 

   public void waitProduct(By selector) {
      this.wait = new WebDriverWait(driver, Wait.EXPLICIT_WAIT);  
      wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
   }
   
   //Click method to add product
   public void clickProduct() {
      waitProduct(productList);
      driver.findElement(productList).click();
   }

}