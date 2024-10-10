package com.anhtester.Bai7_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAdvancedOperation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //Luon uu tien dung
        driver.manage().window().fullscreen(); //Dung trong step cu the khi co yeu cau

        // Đặt thời gian chời ngầm định cho tất cả các element (đơn vị Giây)
       // Ví dụ thiết lập 10 giây cho tất cả
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       //Thiết lập thời gian chờ Load page xong mới thao tác (tối đa 30s)
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        // Navigate to a page
        driver.navigate().to("http://anhtester.com");
        System.out.println(driver.getWindowHandle());//Get ma dinh dang cua tab.

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.google.com/");
        System.out.println(driver.getWindowHandle());//Get ma dinh dang cua tab.
        Thread.sleep(2000);

        driver.quit();

    }
}
