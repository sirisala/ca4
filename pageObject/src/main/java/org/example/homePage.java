package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    WebDriver d;

    By iteam =By.className("inventory_item_name");
    public homePage(WebDriver d){

        this.d=d;

    }
    public  void clickIteam(){
        d.findElement(iteam).click();
    }
}
