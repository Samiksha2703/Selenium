/**
 * Description : AmazonLogin.java is file which is having code for login operations for Amazon.
 * Author      : Samiksha Shende
 * Date        : 21/05/2021
 */

package com.bridgelabz.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement signIn;

    @FindBy(id = "ap_email")
    WebElement mobile;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(id = "ap_password")
    WebElement pass;

    @FindBy(id = "signInSubmit")
    WebElement signInButton;

    public AmazonLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Method to logged in in the amazon web application
    public void loggedInToApp(String userName, String pwd) throws InterruptedException {
        signIn.click();
        // Enter username
        mobile.sendKeys(userName);
        continueButton.click();
        // Enter password
        pass.sendKeys(pwd);
        signInButton.click();
    }
}
