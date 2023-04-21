package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Hello world!
 *
 */
public class LoginPage {
        WebDriver d;

        //these r locaters
    By username = By.id("user-name");
    By password = By.name("password");

    By login = By.id("login-button");



    //this is a constructor

    public LoginPage(WebDriver d){

        this.d=d;

    }

    //these are methods to find the elements and send the string
    public  void  enterUser(String user){

        d.findElement(username).sendKeys(user);
    }
    public  void  enterpassword(String pass){
        d.findElement(password).sendKeys(pass);
    }
    public  void  pressLogin(){
        d.findElement(login).click();
    }





}
