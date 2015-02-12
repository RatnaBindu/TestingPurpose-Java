package com.eviltester.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selen {

    public  void  test1()
    {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://google.com");

    }

}
