import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("http://gogle.com");

        webdriver.manage().window().maximize();

        webdriver.navigate().to("http:amazon.com");

        webdriver.navigate().back();

        webdriver.navigate().forward();

        webdriver.navigate().refresh();


    }
}
