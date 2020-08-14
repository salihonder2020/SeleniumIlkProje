package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http:amazon.com");

        String amazonTitle = driver.getTitle();
        if(amazonTitle.contains("Computers")){
            System.out.println("Computers Kelimesi Var");
        }else{
            System.out.println("Computers Kelimesi Yok");
        }
driver.quit();

    }
}
