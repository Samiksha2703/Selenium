package com.bridgelabz.selenium.utility;

import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Lib implements Constant {

    public static String getProperty(String CONFIG_PATH, String key) {
        String property = "";
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream(CONFIG_PATH));
            property = prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return property;
    }
}