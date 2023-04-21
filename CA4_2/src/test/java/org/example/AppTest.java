package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class AppTest {

    ChromeDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    void setUpDriver(String browser,String url) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(15000);

    }

    @Test
    void dropdown1() {
        WebElement DropDown = driver.findElement(By.id("dropdowm-menu-1"));
        Select dropdown = new Select(DropDown);
        dropdown.selectByVisibleText("Python");
    }
    @Test
    void dropdown2() {
        WebElement DropDown = driver.findElement(By.id("dropdowm-menu-2"));
        Select dropdown = new Select(DropDown);
        dropdown.selectByVisibleText("TestNG");
    }
    @Test
    void dropdown3() {
        WebElement DropDown = driver.findElement(By.id("dropdowm-menu-3"));
        Select dropdown = new Select(DropDown);
        dropdown.selectByVisibleText("JavaScript");

    }
    @Test
    void checkbox1() {
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input")).click();
    }
    @Test
    void checkbox2() {
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]/input")).click();
    }

    @Test
    void radio() throws InterruptedException {
        driver.findElement(By.xpath("  //*[@id=\"radio-buttons\"]/input[3]")).click();
        Thread.sleep(3000);
    }

    void close(){
        driver.close();
    }

}