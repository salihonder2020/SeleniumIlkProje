package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_NavigationOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("http://google.com");
        webdriver.navigate().to("http://youtube.com");
        webdriver.navigate().back();
        webdriver.navigate().forward();
        webdriver.navigate().refresh();
        webdriver.quit();

    }
}
