/**
 * Description : Base.java is file which is having code for prerequisite operations for Amazon.
 * Author      : Samiksha Shende
 * Date        : 21/05/2021
 */


package com.bridgelabz.selenium.base;

import com.bridgelabz.selenium.utility.Screenshot;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Base {
    public static WebDriver driver;
    @BeforeTest
    public void setup() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Screenshot sc = new Screenshot();
        sc.screenshot("HomePage");
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
