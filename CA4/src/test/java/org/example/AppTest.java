package org.example;

import com.driver.Driver;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public void verifylogintest(){
        WebDriver d = Driver.setupbrowser("chrome","https://www.saucedemo.com/");
        PageFactory.initElements(d,App.class);
       App = new App(d);
        l.loginwedsite("standard_user","secret_sauce");


    }
}
