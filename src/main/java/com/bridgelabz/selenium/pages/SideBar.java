/**
 * Description : SideBar.java is file which is having code for side bar operations for Amazon.
 * Author      : Samiksha Shende
 * Date        : 21/05/2021
 */

package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideBar extends Base {
    @FindBy(id = "nav-hamburger-menu")
    WebElement menuButton;

    @FindBy(xpath = "//a[@href='/gp/css/homepage.html?ref_=nav_em_ya_0_1_1_30']")
    WebElement myAccount;

    public SideBar(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectMenuButton() {
        menuButton.click();
    }

    public void chooseYourAccount() {
        myAccount.click();
    }
}
