package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_LocatorElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;

public class DemoWebElement_isSelected {

        public static void main(String[] args) {
        //Khởi tạo trình duyệt
            WebDriver driver;
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Thời gian tối đa để tìm kiếm element

            driver.get("https://crm.anhtester.com/admin/authentication");
            driver.findElement(By.xpath(LocatorsCRM.checkboxRememberMe)).click();
            System.out.println(driver.findElement(By.xpath(LocatorsCRM.checkboxRememberMe)).isSelected());

        //Đóng trình duyệt
            driver.quit();
        }
    }
