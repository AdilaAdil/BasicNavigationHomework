package com.cbt.tests;

import com.cbt.utilities.StringUtility;
import com.cbt.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerificationTests {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String title1 = driver.getTitle();
        System.out.println(title1);
        driver.get(urls.get(1));
        String title2 = driver.getTitle();
        System.out.println(title2);
        driver.get(urls.get(2));
        String title3 = driver.getTitle();
        System.out.println(title3);
        StringUtility.verifyEquals(title1,title2);
        StringUtility.verifyEquals(title2,title3);
        StringUtility.verifyEquals(title1,title3);








    }
}
