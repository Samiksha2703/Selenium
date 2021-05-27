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
import com.bridgelabz.selenium.pages.DashBoard;
import com.bridgelabz.selenium.pages.SignUp;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListener.class)

public class AmazonTest extends Base {
    public AmazonLogin login;
    public DashBoard search;
    public SideBar myAccount;
    public SideBar selectMenu;
    public SignUp signUp;
    public DashBoard addItem;

    //Method to test the login feature functionality
    @Test(priority = 1)
    public void amazon_Login() throws InterruptedException {
        login = new AmazonLogin(driver);
        login.loggedInToApp("samiksha@gmail.com", "Samiksha@82");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/ap/signin");
    }

    //Method to test the search feature of the amazon web application
    @Test(priority = 2)
    public void amazon_Search() {
        search = new DashBoard(driver);
        search.searchItem();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/s?k=boat+earphones&ref=nb_sb_noss");
    }

    //Method to test the functionality of select item
    @Test(priority = 3)
    public void select_Item_From_Result(){
        addItem.selectItem();
    }

//    //Method to test the functionality of the menu button
//    @Test(priority = 3)
//    public void select_From_Menu() {
//        myAccount = new SideBar(driver);
//        myAccount.selectMenuButton();
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/s?k=boat+earphones&ref=nb_sb_noss");
//    }
//
//    //Method to test the functionality of the Your Account button
//    @Test(priority = 4)
//    public void select_Your_Account() {
//        myAccount = new SideBar(driver);
//        myAccount.chooseYourAccount();
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/gp/css/homepage.html?ref_=nav_em_ya_0_1_1_30");
//    }
//
//    //Method to test the functionality of the SignOut button
//    @Test(priority = 5)
//    public void select_Logout() {
//        selectMenu = new SideBar(driver);
//        selectMenu.signOut_From_Account();
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Faction%3Dsign-out%26ie%3DUTF8%26path%3D%252Fgp%252Fhomepage.html%253F_encoding%253DUTF8%26ref_%3Dnav_em_signout_0_1_1_32%26ref_%3Dnavm_em_signin%26ref_%3Dnavm_em_signin%26signIn%3D1%26useRedirectOnSuccess%3D1");
//    }
}
