package org.seleniumdemo.test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.seleniumdemo.pageobject.*;


public class Test_Without_POM {
    WebDriver driver;
        
     
    @Test
    public void test() throws InterruptedException {
    
    //Instantiating chrome driver
    WebDriver driver = new ChromeDriver();
    
    //Opening web application
    driver.get("https://www.amazon.com");
    
    //Locating the Login button and clicking on it
    driver.findElement(By.id("login")).click();
    
    //Locating the username & password and passing the credentials
    driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
    driver.findElement(By.id("password")).sendKeys("Password@123");
    
    //Click on the login button
    driver.findElement(By.id("login")).click();
    
    //Print the web page heading
    System.out.println("The page title is : " +driver.findElement(By.xpath("//*[@id=\"app\"]//div[@class=\"main-header\"]")).getText());
    
    //Click on Logout button
    // driver.findElement(By.id("submit")).click();
    WebDriverWait wait = new WebDriverWait(driver, 15);
        
    // wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".mr-2")).get(0)));
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".mr-3")));
    Assert.assertEquals(driver.findElement(By.cssSelector(".main-header")).getText(), "Book Store");
    
    //Close driver instance
    driver.quit();
    }
   }
