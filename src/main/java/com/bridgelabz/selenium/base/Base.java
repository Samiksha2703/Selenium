/**
 * Description : Base.java is file which is having code for prerequisite operations for Amazon.
 * Author      : Samiksha Shende
 * Date        : 21/05/2021
 */


package com.bridgelabz.selenium.base;

import com.bridgelabz.selenium.utility.Constant;
import com.bridgelabz.selenium.utility.Lib;
import com.bridgelabz.selenium.utility.Screenshot;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Base implements Constant {
    public static WebDriver driver;

    @BeforeTest
    public static void setup() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        // launch application
        String url = Lib.getProperty(CONFIG_PATH,"url");
        driver.get(url);
        Screenshot sc = new Screenshot();
        sc.screenshot("HomePage");
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
