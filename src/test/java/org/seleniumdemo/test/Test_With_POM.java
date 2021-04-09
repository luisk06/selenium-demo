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


public class Test_With_POM {

        WebDriver driver;
        
     
        @Test
        public void test() throws InterruptedException {
        
        //Instantiating chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Opening web application
        driver.get("https://www.amazon.com");

        HomePage home = new HomePage(driver);

        ResultsPage results = new ResultsPage(driver);

        ProductDetailPage productPage = new ProductDetailPage(driver);

        Thread.sleep(1000);

        String text = "software engineering";

        home.searchText(text);

        Thread.sleep(1000);

        results.clickProduct();

        Thread.sleep(1000);
        productPage.clickAddCart();

        Thread.sleep(1000);
        home.viewCart();
        //Close driver instance
        // driver.quit();
        }
  
   }
