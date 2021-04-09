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

public class WaitPageElement {
    WebDriver driver;
    // WebDriverWait wait;

    public WaitPageElement(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        // this.wait = wait;
    }
    public void waits (By itemLocator, WebDriver driver, WebDriverWait wait) {
        System.out.println("hello: " + itemLocator);
        // WebDriverWait wait = new WebDriverWait(driver, 15);  
        wait.until(ExpectedConditions.visibilityOfElementLocated(itemLocator));
    }
}
