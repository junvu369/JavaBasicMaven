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
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("search_input")).sendKeys("Selenium");
        Thread.sleep(2000);

        //Tắt trình duyệt
        driver.quit();

    }
}