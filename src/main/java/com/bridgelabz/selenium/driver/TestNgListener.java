/**
 * Description : TestNgListener.java is test file which is having TestNg Listener Methods.
 * Author      : Samiksha Shende
 * Date        : 21/05/2021
 */

package com.bridgelabz.selenium.driver;

import com.bridgelabz.selenium.utility.Screenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestNgListener implements ITestListener {

    Screenshot sc = new Screenshot();

    //Method to print log when every test starts
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test starts " + result.getName());
        try {
            sc.screenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method to print log when test executes successfully
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Name of the test case passed is " + result.getName());
        try {
            sc.screenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method to print log when test fails
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Name of the test case failed is " + result.getName());
        try {
            sc.screenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method to print log when test skipped
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Name of the test case skipped is " + result.getName());
        try {
            sc.screenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method to print log when test failed with success percentage
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Name of the test case failed with success percentage is " + result.getName());
        try {
            sc.screenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method to print log when test failed with timeout
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Name of the test case failed with timeout is " + result.getName());
        try {
            sc.screenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method to print log when test execution finish
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Finished for " + context.getName());
        try {
            sc.screenshot(context.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

