/**
 * Description : SignUp.java is test file which is having code for SignUp for Amazon.
 * Author      : Tushar Chawat
 * Date        : 21/05/2021
 */

package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp extends Base {
    @FindBy(xpath = "//a[starts-with(@href,'https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&')]")
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
