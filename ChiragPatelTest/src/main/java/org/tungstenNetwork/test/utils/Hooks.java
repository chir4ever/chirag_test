package org.tungstenNetwork.test.utils;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chirag Patel on 30/11/17.
 */

public class Hooks {

    public static WebDriver driver;

    public static WebDriver getDriver()
    {
        return driver;
    }


    public Hooks() {
        PageFactory.initElements(driver, this);
    }


    @BeforeClass
    public static void openBrowser()
    {
        System.out.println("starting the browser");
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk");//open
        driver.manage().window().maximize();
        //FOR SET TIME OUT
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void closeBrowser()
    {
        System.out.println("I am in closing");
        driver.quit();
    }
}

