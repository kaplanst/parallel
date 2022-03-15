package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {

    private DriverProvider(){

    }
    private static DriverProvider instance = new DriverProvider();

    public static DriverProvider getInstance(){
        return instance;
    }

    static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() {
        @Override
        protected WebDriver initialValue() {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
    };

    public WebDriver getDriver(){
        return driver.get();
    }

    public void removeDriver(){
        driver.get().quit();
        driver.remove();
    }

}
