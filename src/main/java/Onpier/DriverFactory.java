package Onpier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

    private static WebDriver driver;
    private static WebDriverWait wait;

    private DriverFactory(){
        // prevent instantiation
    }

    public static WebDriver getChromeDriver(){

        if(driver == null){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\moham\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriverWait getWebDriverWait(){
        if(wait == null){
            wait = new WebDriverWait(getChromeDriver(), 10);
        }
        return wait;
    }
}
