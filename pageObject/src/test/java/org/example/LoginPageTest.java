package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class LoginPageTest {
    WebDriver d;
    @Test
    public void loginverify() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        d= new ChromeDriver();

        d.get("https://www.saucedemo.com/");
        d.manage().window().maximize();

//        LoginPage LP = new LoginPage(d);
//        LP.enterUser("standard_user");
//        LP.enterpassword("secret_sauce");
//        LP.pressLogin();
//        homePage h= new homePage(d);
//        h.clickIteam();
        LoginUpdate u= new LoginUpdate(d);
        u.loginwedsite("standard_user","secret_sauce");





        Thread.sleep(1000);
        d.close();

    }
}
