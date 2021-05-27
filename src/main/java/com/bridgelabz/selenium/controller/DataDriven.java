package com.bridgelabz.selenium.controller;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.pages.AmazonLogin;
import com.bridgelabz.selenium.pages.SideBar;
import com.bridgelabz.selenium.utility.ReadFile;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven extends Base {
    public AmazonLogin al;
    public static SideBar sideBar;
    private static Object[][] sign_in_credentials;

    @Test(dataProvider = "testdata")
    public void data_Driven_Demo_Method(String username, String password) throws InterruptedException {
        al = new AmazonLogin(driver);
        al.loggedInToApp(username, password);
        sideBar = new SideBar(driver);
        sideBar.signOut_From_Account();
        driver.get("https://www.amazon.in/");
//      Assert.assertTrue(driver.getTitle().matches("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
    }

    @DataProvider(name = "testdata")
    public Object[][] testData() {
        ReadFile readFile = new ReadFile("C:\\Users\\kalam\\IdeaProjects\\AmazonSelinium\\src\\main\\resources\\TestData.xls");
        int rows = readFile.getRowCount(0);
        sign_in_credentials = new Object[rows][2];
        for (int i = 0; i < rows; i++) {
            sign_in_credentials[i][0] = readFile.getData(0, i, 0);
            sign_in_credentials[i][1] = readFile.getData(0, i, 1);
        }
        return sign_in_credentials;
    }
}
