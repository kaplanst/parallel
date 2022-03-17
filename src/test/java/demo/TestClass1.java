package demo;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass1 {

    @BeforeMethod
    public static void BeforeTest(){
        DriverProvider.getInstance().getDriver().get("https://vkitae.kz/");
        DriverProvider.getInstance().getDriver().manage().window().maximize();
        DriverProvider.getInstance().getDriver().manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    }

    @Test
    public static void TestOne() throws InterruptedException {
        System.out.println(Thread.currentThread().getId());
        DriverProvider.getInstance().getDriver().findElement(By.xpath("//input[@name='search']")).sendKeys("Бальзам Белый тигр");
        Thread.sleep(2000);
        DriverProvider.getInstance().getDriver().findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        DriverProvider.getInstance().getDriver().findElement(By.xpath("//img[@alt='Бальзам Белый тигр']")).click();
    }

    @Test
    public static void TestTwo() throws InterruptedException {
        System.out.println(Thread.currentThread().getId());
        DriverProvider.getInstance().getDriver().findElement(By.xpath("//input[@name='search']")).sendKeys("Крем-бальзам SUNGAZ");
        Thread.sleep(2000);
        DriverProvider.getInstance().getDriver().findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        DriverProvider.getInstance().getDriver().findElement(By.xpath("//img[@alt='Крем-бальзам SUNGAZ']")).click();
    }

    @Test
    public static void TestThree() throws InterruptedException {
        System.out.println(Thread.currentThread().getId());
        DriverProvider.getInstance().getDriver().findElement(By.xpath("//input[@name='search']")).sendKeys("Крем для рук Collagen");
        Thread.sleep(2000);
        DriverProvider.getInstance().getDriver().findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        DriverProvider.getInstance().getDriver().findElement(By.xpath("//img[@alt='Крем для рук Collagen']")).click();
    }

    @Test
    public static void TestFour() throws InterruptedException {
        System.out.println(Thread.currentThread().getId());
        DriverProvider.getInstance().getDriver().findElement(By.xpath("//input[@name='search']")).sendKeys("Крем для рук Алоэ");
        Thread.sleep(2000);
        DriverProvider.getInstance().getDriver().findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        DriverProvider.getInstance().getDriver().findElement(By.xpath("//img[@alt='Крем для рук Алоэ']")).click();
    }

    @AfterMethod
    public static void AfterTest(){
        DriverProvider.getInstance().removeDriver();
    }

}
