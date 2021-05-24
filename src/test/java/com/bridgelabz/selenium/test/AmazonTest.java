/**
 * Description : AmazonTest.java is test file which is having test cases for Amazon.
 * Author      : Samiksha Shende
 * Date        : 21/05/2021
 */


package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.driver.TestNgListener;
import com.bridgelabz.selenium.pages.AmazonLogin;
import com.bridgelabz.selenium.pages.SideBar;
import com.bridgelabz.selenium.pages.SearchItem;
import com.bridgelabz.selenium.pages.SignUp;
import com.bridgelabz.selenium.utility.Screenshot;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(TestNgListener.class)

public class AmazonTest extends Base {
    public AmazonLogin login;
    public SearchItem search;
    public SideBar myAccount;
    public SignUp signUp;

    Screenshot sc = new Screenshot();

    @Test(priority = 1)
    public void amazon_Login() throws InterruptedException, IOException {
        login = new AmazonLogin(driver);
        login.loggedInToApp();
        System.out.println("Logged in into the application");
        sc.screenshot("HomePage");
    }

    @Test(priority = 2)
    public void amazon_Search() throws IOException {
        search = new SearchItem(driver);
        search.searchItem();
        System.out.println("Result showing for search item");
        sc.screenshot("Searched Product");
    }

    @Test(priority = 3)
    public void select_From_Menu() throws IOException {
        myAccount = new SideBar(driver);
        myAccount.selectMenuButton();
        System.out.println("Menu button selected");
        sc.screenshot("Menu");
    }

    @Test(priority = 4)
    public void select_Your_Account() throws IOException {
        myAccount = new SideBar(driver);
        myAccount.chooseYourAccount();
        System.out.println("Open Your Account");
        sc.screenshot("Account");
    }

    @Test(priority = 5)
    public void amazon_SignUp(){
        signUp = new SignUp(driver);
        signUp.SignUpIntoApp();
    }
}
