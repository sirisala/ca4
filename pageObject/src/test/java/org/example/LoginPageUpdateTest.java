package org.example;

import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageUpdateTest {

    @Test
    public void verifylogintest(){
        WebDriver d = FactoryBrowser.setupbrowser("chrome","https://www.saucedemo.com/");
        PageFactory.initElements(d,LoginUpdate.class);
        LoginUpdate l= new LoginUpdate(d);
        l.loginwedsite("standard_user","secret_sauce");


    }


}
