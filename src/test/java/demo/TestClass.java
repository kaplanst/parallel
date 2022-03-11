package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass {


    @Test
    public static void TestOne() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://bhphotovideo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='top-search-input']")).sendKeys("pen drive");
        driver.findElement(By.xpath("//button[@name='Top Nav-Search']")).click();
        driver.findElement(By.linkText("SanDisk 64GB Ultra Dual Drive Luxe USB 3.1 Flash Drive (USB Type-C / Type-A)")).click();
        driver.quit();
    }

    @Test
    public static void TestTwo() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://bhphotovideo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='top-search-input']")).sendKeys("Dell laptop");
        driver.findElement(By.xpath("//button[@name='Top Nav-Search']")).click();
        driver.findElement(By.linkText("Latitude Laptops & Tablets")).click();
        driver.quit();
    }
    @Test
    public static void TestThree() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://bhphotovideo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='top-search-input']")).sendKeys("Bububu");
        driver.findElement(By.xpath("//button[@name='Top Nav-Search']")).click();
        driver.quit();
    }

}
