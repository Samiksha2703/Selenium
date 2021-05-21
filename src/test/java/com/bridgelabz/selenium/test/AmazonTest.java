package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.pages.AmazonLogin;
import com.bridgelabz.selenium.pages.SideBar;
import com.bridgelabz.selenium.pages.SearchItem;
import com.bridgelabz.selenium.pages.SignUp;
import org.testng.annotations.Test;

public class AmazonTest extends Base {
    public AmazonLogin login;
    public SearchItem search;
    public SideBar myAccount;
    public SignUp signUp;

    @Test
    public void amazon_Login() throws InterruptedException {
        login = new AmazonLogin(driver);
        login.loggedInToApp();
    }

    @Test
    public void amazon_Search() throws InterruptedException {
        search = new SearchItem(driver);
        search.searchItem();
    }

    @Test
    public void select_From_Menu(){
        myAccount = new SideBar(driver);
        myAccount.selectMenuButton();
    }

    @Test
    public void select_Your_Account() {
        myAccount = new SideBar(driver);
        myAccount.chooseYourAccount();
    }

    @Test
    public void amazon_SignUp(){
        signUp = new SignUp(driver);
        signUp.SignUpIntoApp();
    }
}
