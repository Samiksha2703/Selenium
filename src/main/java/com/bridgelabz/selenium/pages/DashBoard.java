package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.utility.Constant;
import com.bridgelabz.selenium.utility.Lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class DashBoard extends Base implements Constant {
//    @FindBy(id = "twotabsearchtextbox")
//    WebElement item;
//
//    @FindBy(id = "nav-search-submit-button")
//    WebElement searchButton;
//
//    @FindBy(xpath = "//div[@data-component-type=s-search-result]")
//    WebElement Items;
//
//    //@FindBy(xpath = "//span[@class='rush-component']")
//    @FindBy(xpath = "//div[@id='search']")
//    List<WebElement> results;

    public DashBoard(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchItem() {
        driver.findElement(By.id(Lib.getProperty(CONFIG_PATH, "item"))).sendKeys("boat earphones");
        driver.findElement(By.id(Lib.getProperty(CONFIG_PATH,"searchButton"))).click();
    }

//    public void selectItem() {
//        System.out.println("list" + results);
//        results.get(42).click();
//    }
}
