package org.example;


import com.beust.ah.A;
import com.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
        @Test
       public void method(){
           WebDriver d = Driver.setupbrowser("chrome","https://www.tcl.com/in/en");
           PageFactory.initElements(d,App.class);
            App a= new App(d);

            d.testprofile();
       }


}