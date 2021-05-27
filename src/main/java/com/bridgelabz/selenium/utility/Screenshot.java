/**
 * Description : Screenshot.java is file which is having code for screenshot for Amazon.
 * Author      : Samiksha Shende
 * Date        : 21/05/2021
 */


package com.bridgelabz.selenium.utility;

import com.bridgelabz.selenium.base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Screenshot extends Base {

    //Method to take a screenshot
    public void screenshot(String fileName) throws IOException {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\kalam\\Screenshot/"+fileName+".jpg"));
        System.out.println("Screenshot Taken");
    }
}
