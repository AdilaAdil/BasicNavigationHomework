package com.cbt.tests;

import com.cbt.utilities.StringUtility;
import com.cbt.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {
        Chrome();
        FireFox();
        Safari();
    }

    public static void Chrome(){
        //  1.Open	browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2.go to the website https://www.google.com/
        driver.get("https://www.google.com/");
        // 3.Save the title in a string variable
        String googleTitle = driver.getTitle();
        //4. go to https://etsy.com
        driver.navigate().to("https://www.etsy.com");
        //5.Save the title in a	string variable
        String etsyTitle = driver.getTitle();
        //6. navigate back to previous page
        driver.navigate().back();
        // 7.verify that title is same is in step 3
        StringUtility.verifyEquals(googleTitle,googleTitle);
        //8. navigate forward to previous page
        driver.navigate().forward();
        //9.verify that title is same is in step 5
        StringUtility.verifyEquals(etsyTitle,etsyTitle);
        driver.quit();



    }

    public static void FireFox(){

        //  1.Open	browser
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        // 2.go to the website https://www.google.com/
        driver.get("https://www.google.com/");
        // 3.Save the title in a string variable
        String googleTitle = driver.getTitle();
        //4. go to https://etsy.com
        driver.navigate().to("https://www.etsy.com");
        //5.Save the title in a	string variable
        String etsyTitle = driver.getTitle();
        //6. navigate back to previous page
        driver.navigate().back();
        // 7.verify that title is same is in step 3
        StringUtility.verifyEquals(googleTitle,googleTitle);
        //8. navigate forward to previous page
        driver.navigate().forward();
        //9.verify that title is same is in step 5
        StringUtility.verifyEquals(etsyTitle,etsyTitle);
        driver.quit();
    }

    public static void Safari(){

        //  1.Open	browser
        WebDriver driver = WebDriverFactory.getDriver("safari");
        // 2.go to the website https://www.google.com/
        driver.get("https://www.google.com/");
        // 3.Save the title in a string variable
        String googleTitle = driver.getTitle();
        //4. go to https://etsy.com
        driver.navigate().to("https://www.etsy.com");
        //5.Save the title in a	string variable
        String etsyTitle = driver.getTitle();
        //6. navigate back to previous page
        driver.navigate().back();
        // 7.verify that title is same is in step 3
        StringUtility.verifyEquals(googleTitle,googleTitle);
        //8. navigate forward to previous page
        driver.navigate().forward();
        //9.verify that title is same is in step 5
        StringUtility.verifyEquals(etsyTitle,etsyTitle);
        driver.quit();
    }

}