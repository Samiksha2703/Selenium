/**
 * Description : AmazonLogin.java is file which is having code for login operations for Amazon.
 * Author      : Samiksha Shende
 * Date        : 21/05/2021
 */

package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin extends Base {
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

    public void loggedInToApp() throws InterruptedException {
        signIn.click();
        mobile.sendKeys("8669874563");
        continueButton.click();
        pass.sendKeys("WelSam@27");
        signInButton.click();
        Thread.sleep(50000);
        return;
    }
}
