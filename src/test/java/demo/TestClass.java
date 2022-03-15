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
        driver.get("https://vkitae.kz/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Бальзам Белый тигр");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        driver.findElement(By.xpath("//img[@alt='Бальзам Белый тигр']")).click();
        driver.quit();
    }

    @Test
    public static void TestTwo() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://vkitae.kz/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Крем-бальзам SUNGAZ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        driver.findElement(By.xpath("//img[@alt='Крем-бальзам SUNGAZ']")).click();
        driver.quit();
    }

//    @Test
//    public static void TestThree() throws InterruptedException {
//        WebDriver driver;
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://vkitae.kz/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Крем для рук Collagen");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
//        driver.findElement(By.xpath("//img[@alt='Крем для рук Collagen']")).click();
//        driver.quit();
//    }
//
//    @Test
//    public static void TestFour() throws InterruptedException {
//        WebDriver driver;
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://vkitae.kz/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Крем для рук Алоэ");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
//        driver.findElement(By.xpath("//img[@alt='Крем для рук Алоэ']")).click();
//        driver.quit();
//    }


}
