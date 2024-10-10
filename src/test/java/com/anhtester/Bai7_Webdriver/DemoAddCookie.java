package com.anhtester.Bai7_Webdriver;

import com.anhtester.Bai5_LocatorElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAddCookie {
    public static void main(String[] args) throws InterruptedException {
        //Khởi tạo trình duyệt
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Thời gian tối đa để tìm kiếm element

        driver.get("https://crm.anhtester.com/admin/authentication");

//        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
//        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
//        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin123@example.com");
//        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
//        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        Cookie newCookie = new Cookie("sp_session", "e322a3e293fb932ca452f6160fe21f88f2a0214a");
        driver.manage().addCookie(newCookie);
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.quit();
    }
}
