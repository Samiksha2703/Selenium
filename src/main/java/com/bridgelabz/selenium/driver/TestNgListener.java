/**
 * Description : TestNgListener.java is test file which is having TestNg Listener Methods.
 * Author      : Samiksha Shende
 * Date        : 21/05/2021
 */

package com.bridgelabz.selenium.driver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test starts "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    System.out.println("Name of the test case passed is "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Name of the test case failed is "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Name of the test case skipped is "+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Name of the test case failed with success percentage is "+result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Name of the test case failed with timeout is "+result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Finished");
    }
}
