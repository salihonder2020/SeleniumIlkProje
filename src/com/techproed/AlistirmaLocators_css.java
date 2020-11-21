package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlistirmaLocators_css {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emaiKutusu = driver.findElement(By.cssSelector(".form-control"));
        emaiKutusu.sendKeys("testtechproed@gmail.com");
        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">

        WebElement sifreKutusu = driver.findElement(By.cssSelector("#session_password"));
        sifreKutusu.sendKeys("Test1234!");
        sifreKutusu.submit();




    }
}
