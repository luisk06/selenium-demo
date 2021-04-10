package org.seleniumdemo.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.seleniumdemo.pageobject.*;


public class Add_To_Cart {
        public static void main(String[] args) throws Exception {
                addToCartTest();
        }
        
        @Test
        public static void addToCartTest() throws Exception {
                
                //Instantiating chrome driver
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                //Opening web application
                driver.get("https://www.amazon.com");

                HomePage home = new HomePage(driver);

                ResultsPage results = new ResultsPage(driver);

                ProductDetailPage productPage = new ProductDetailPage(driver);

                CartPage cartPage = new CartPage(driver);

                String text = "Seagate Portable 2TB";

                home.searchText(text);

                results.clickProduct();

                productPage.clickAddCart();

                home.viewCart();

                assertEquals(1, cartPage.verifyCart());

                //Close driver instance
                driver.quit();
        }
}
