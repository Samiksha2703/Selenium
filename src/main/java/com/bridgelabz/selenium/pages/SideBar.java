/**
 * Description : SideBar.java is file which is having code for side bar operations for Amazon.
 * Author      : Samiksha Shende
 * Date        : 21/05/2021
 */

package com.bridgelabz.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideBar {
    @FindBy(id = "nav-hamburger-menu")
    WebElement menuButton;

    @FindBy(xpath = "//a[@href='/gp/css/homepage.html?ref_=nav_em_ya_0_1_1_30']")
    WebElement myAccount;

    @FindBy(linkText = "Sign Out")
    WebElement signOut;

    public SideBar(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Method to click on menu button
    public void selectMenuButton() {
        menuButton.click();
    }

    //Method to select from menu options
    public void chooseYourAccount() {
        //Select from menu
        myAccount.click();
    }

    //Method to sign out from the account
    public void signOut_From_Account() {
        menuButton.click();
        signOut.click();
    }
}
