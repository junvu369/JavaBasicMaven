package com.anhtester.Bai5_LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class ThuoctinhHTML {
    public static void main(String[] args) throws InterruptedException {

        //Setup trình duyệt Chrome
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Thời gian chờ đợi tối đa để tìm kiếm element

        //Code Auto thao tác
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000); //Khoảng ngừng giữa các thao tác
        driver.findElement(By.id("email")).sendKeys("admin@example.com");//Tìm kiếm element
//        driver.findElement(By.name("email")).sendKeys("admin@example.com"); // Tìm theo name.

        driver.findElement(By.name("password")).sendKeys("123456");
//        driver.findElement(By.id("password")).sendKeys("123456");// Tìm theo ID

//        driver.findElement(By.linkText("Forgot Password?")).click(); //Tìm theo linkText
//        driver.findElement(By.partialLinkText("Forgot")).click();  //Tìm theo 1 phần linkText

        driver.findElement(By.className("btn")).click(); //className dễ bị trùng nên ít dùng. class="btn btn-primary btn-block" (gồm 3 tên), Selenium chỉ nhận 1 tên trong 3 tên
        driver.findElement(By.tagName("button")).click();// tagName dễ bị trùng nên ít dùng

        Thread.sleep(1000);
        driver.findElement(By.id("search_input")).sendKeys("Selenium");
        Thread.sleep(2000);

        //Tắt trình duyệt
        driver.quit();

    }
}
