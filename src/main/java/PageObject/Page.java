package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
    public Page(){}

    public static WebDriver driver;

    public static org.openqa.selenium.WebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Files\\OpenServer\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
}