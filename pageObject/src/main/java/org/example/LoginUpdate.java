package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginUpdate {

    WebDriver d;
    @FindBy(id = "user-name")WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement login;

    public LoginUpdate(WebDriver d){
        this.d=d;

    }

    public  void  loginwedsite(String user,String pass){

       username.sendKeys(user);
        password.sendKeys(pass);
        login.click();


    }
}
