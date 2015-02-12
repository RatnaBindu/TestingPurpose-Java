package com.eviltester.webdriver;

import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.testng.annotations.Test;

public class SelenTest {
    @Test
    public  static  void  test1()
    {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://google.com");
        driver.findElement(By.id("gbqfq")).sendKeys("Hello World");
        driver.findElement(By.id("gbqfb")).click();
    }
}