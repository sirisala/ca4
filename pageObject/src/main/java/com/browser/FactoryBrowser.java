package com.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FactoryBrowser {
    static WebDriver d;
    public static WebDriver setupbrowser(String browser, String link){

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            d = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            d = new EdgeDriver();
        }
        d.get(link);
        d.manage().window().maximize();

        return d;

    }
}
