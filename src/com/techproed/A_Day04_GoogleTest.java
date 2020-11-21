package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class A_Day04_GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.get("https:\\www.google.com");
        //<input class="gLFyf gsfi" maxlength="2048" name="q" type="text" jsaction="paste:puy29d" aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Suche" value="" aria-label="Suche" data-ved="0ahUKEwjPtJXEkrvrAhUkxoUKHcsXAkgQ39UDCAQ">

        WebElement searchKutusu = driver.findElement(By.name("q"));
        searchKutusu.sendKeys("city bike");
        searchKutusu.submit();

        //<div id="result-stats">Ungefähr 1’280’000’000 Ergebnisse<nobr> (0.55 Sekunden)&nbsp;</nobr></div>
        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());

        WebElement soppingTikla = driver.findElement(By.partialLinkText("Shopping"));
        soppingTikla.click();
        /*
        <img class="TL92Hc" alt="" id="srpresultimg_13118575672675473476_1_0" src="data:image/webp;base64,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" style="height:119px;width:180px" data-iml="1598524283599" data-atf="1">
         */

        WebElement ilkFotografTikla = driver.findElement(By.id("srpresultimg_13118575672675473476_1_0"));
        ilkFotografTikla.click();


        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
