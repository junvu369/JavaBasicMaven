package com.anhtester.Bai5_LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathTuyetDoi {
    public static void main(String[] args) throws InterruptedException {

        //Setup trình duyệt Chrome
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Thời gian chờ đợi tối đa để tiìm kiếm element

        //Code Auto thao tác
        driver.get("https://crm.anhtester.com/admin/authentication");  //Nhập URL
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("admin@example.com"); //Tìm ô email và nhập email
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/button")).click();
        driver.findElement(By.xpath("/html/body/aside/ul/li[3]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/aside/ul/li[3]/a/span")).click(); //Click vào Customer.
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/a[1]")).click(); //Click vào (+New Customer).
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("Công ty TNHH Selenium");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[3]/input")).sendKeys("11223344");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[4]/input")).sendKeys("0123456789");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[2]/button[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div[1]/div[2]/div/div[1]/form/div[2]/div[1]/div[3]/ul/li[2]/a")).click();
//        driver.findElement(By.id("search_input")).sendKeys("Selenium");
        Thread.sleep(2000);

        //Tắt trình duyệt
        driver.quit();

    }
}
