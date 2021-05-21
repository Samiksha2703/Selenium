package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp extends Base {
    @FindBy(xpath = "//a[contains(text(),'Start here')]")
    WebElement signUpLink;

    @FindBy(id = "ap_customer_name")
    WebElement name;

    @FindBy(id = "ap_phone_number")
    WebElement mobile;

    @FindBy(id = "ap_email")
    WebElement email;

    @FindBy(id = "ap_password")
    WebElement pass;

    @FindBy(id = "continue")
    WebElement continueButton;

    public SignUp(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void SignUpIntoApp(){
        signUpLink.click();
        name.sendKeys("Laxmikant Shende");
        mobile.sendKeys("9975703730");
        email.sendKeys("sanjunana50@gmail.com");
        pass.sendKeys("Laxmikant@65");
    }
}
