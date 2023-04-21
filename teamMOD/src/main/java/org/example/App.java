package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Hello world!
 *
 */
public class App 
{
    WebDriver d;
    @FindBy(xpath = "//*[@id=\"common-header-root\"]/div/nav/div/div/div[2]/ul/li[3]/a/i")
    WebElement profile;

    public App(WebDriver d){
        this.d=d;
    }
    public  void  TestProfile(){

        profile.click();
    }
}
