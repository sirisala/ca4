package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * Unit test for simple App.
 */
public class AppTest {

    ChromeDriver d= new ChromeDriver();
    @BeforeClass
    @Parameters({"browser","url"})
    public void driversetup(String browser,String url){
        WebDriverManager.chromedriver().setup();
        d.get(url);
        d.manage().window().maximize();
    }
    @Test
     void testprofile() throws InterruptedException {

        d.findElement(By.xpath("//*[@id=\"common-header-root\"]/div/nav/div/div/div[2]/ul/li[3]/a/i")).click();
        Thread.sleep(1000);

    }
    @Test
    void wrongDetails() throws InterruptedException {
        ResourceBundle r1 = ResourceBundle.getBundle("config");
        String email1= r1.getString("email1");
        String pass1 = r1.getString("pass1");
        d.findElement(By.xpath("//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/input")).sendKeys(email1);
        Thread.sleep(1000);
        d.findElement(By.xpath("//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[3]/div[1]/div[1]/input")).sendKeys(pass1);
        Thread.sleep(1000);
        d.findElement(By.xpath("//*[@id=\"t-container\"]/div/div/div[1]/div[1]/button/div")).click();
        Thread.sleep(1000);

    }
    @Test
    void clear() throws InterruptedException {
        WebElement userEmail = d.findElement(By.xpath("//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/input"));
        String ue = Keys.chord(Keys.CONTROL, "a");
        userEmail.sendKeys(ue);
        userEmail.sendKeys(Keys.DELETE);

        Thread.sleep(1000);
        WebElement userPassword=d.findElement(By.xpath("//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[3]/div[1]/div[1]/input"));
        String up = Keys.chord(Keys.CONTROL, "a");
        userPassword.sendKeys(up);
        userPassword.sendKeys(Keys.DELETE);
        Thread.sleep(1000);


    }
    @Test
     void  enterDetails() throws InterruptedException {
        ResourceBundle r = ResourceBundle.getBundle("config");
        String email= r.getString("email");
        String pass = r.getString("pass");
        d.findElement(By.xpath("//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/input")).sendKeys(email);
        Thread.sleep(1000);
        d.findElement(By.xpath("//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[3]/div[1]/div[1]/input")).sendKeys(pass);
        Thread.sleep(1000);
        d.findElement(By.xpath("//*[@id=\"t-container\"]/div/div/div[1]/div[1]/button/div")).click();
        Thread.sleep(1000);
    }

    @Test
    void products() throws InterruptedException {
        d.findElement(By.xpath("//*[@id=\"common-header-root\"]/div/nav/div/div/div[1]/div/div/ul[1]/li[1]/a/i")).click();
        Thread.sleep(1000);
        d.findElement(By.xpath("//*[@id=\"common-header-root\"]/div/nav/div/div/div[1]/div/div/ul[1]/li[1]/div/div[2]/ul/li[1]/div/div[1]/a/span")).click();

    }
    @Test
    void selectIteam() throws InterruptedException {
        d.findElement(By.xpath("//*[@id=\"product-product-list-root\"]/div/div[4]/div[2]/div[1]/div[1]/div/div[1]/ul/li/a/div/picture/img")).click();
        Thread.sleep(1000);

    }
    @Test
    void goToShop() throws InterruptedException {

        String c = Keys.chord(Keys.CONTROL,Keys.ENTER);
        d.findElement(By.xpath("//*[@id=\"container-08da6ad5da\"]/div[2]/div/div[2]/div[2]/div[5]/a")).sendKeys(c);
        Thread.sleep(1000);
        ArrayList<String> newTb = new ArrayList<String>(d.getWindowHandles());
        d.switchTo().window(newTb.get(1));
        //String newlink = d.getTitle();
        Thread.sleep(1000);

        Thread.sleep(1000);
    }
    @Test
    void addToCart() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("window.scrollBy(0,250)", "");

        d.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/div[3]/div[1]/div/div[2]/button")).click();
        Thread.sleep(1000);
    }
//    @Test
//    void method(){
//        d.findElement(By.)
//    }


    @AfterClass
    void close(){
        d.close();
    }





}
