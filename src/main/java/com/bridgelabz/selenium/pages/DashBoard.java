package com.bridgelabz.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashBoard {
    @FindBy(id = "twotabsearchtextbox")
    WebElement item;

    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    @FindBy(xpath = "//div[@data-component-type=s-search-result]")
    WebElement Items;

    //@FindBy(xpath = "//span[@class='rush-component']")
    @FindBy(xpath = "//div[@id='search']")
    List<WebElement> results;

    public DashBoard(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchItem() {
        item.sendKeys("boat earphones");
        searchButton.submit();
        return;
    }

    public void selectItem() {
        System.out.println("list" + results);
        results.get(42).click();
    }
}
