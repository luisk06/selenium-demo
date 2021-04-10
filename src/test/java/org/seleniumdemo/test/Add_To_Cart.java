package org.seleniumdemo.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.seleniumdemo.pageobject.*;


public class Add_To_Cart {
        public static void main(String[] args) throws Exception {
                // Test Case for adding one item to shopping cart
                addToCartTest();
                // Parenthesis test class call
                ParenthesisTest.main("The -((((12345))))- brown fox (-123-((4567))89umxc)ps (ov(er)) the ((lazy)) ()dog.");
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
                // Search products using the textbox available for that purpose
                home.searchText(text);

                // Click to see one product details 
                results.clickProduct();

                // Add the chosen product to shopping cart
                productPage.clickAddCart();

                // View shopping cart summary
                home.viewCart();

                // Verify the product was added to shopping cart
                assertEquals(1, cartPage.verifyCart());

                //Close driver instance
                driver.quit();
        }
}
