package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_LocatorElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElementCRM {
    public static void main(String[] args) {
    //Khởi tạo trình duyệt
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Thời gian tối đa để tìm kiếm element

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin123@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
//        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).submit(); //Thay cho thao tác ấn Enter
        
        //getCSS values
        System.out.println("Css background-color Login button: "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("background-color"));
        System.out.println("Css border-color Login button: "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("border-color"));
        System.out.println("Css color Login button: "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("color"));
        System.out.println("Css font-family Login button: "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("font-family"));
        System.out.println("Css font-size Login button: "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("font-size"));
        System.out.println("Css height Login button: "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("height"));
        System.out.println("Css width Login button: "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("width"));

        //Get Attribute
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputEmail)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputPassword)).getAttribute("value"));


        //Get size
        System.out.println("Height width (Login button): "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize());
        System.out.println("Height (Login button): "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().getHeight());
        System.out.println("Width (Login button): "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().getWidth());

        //Get Location
        System.out.println("Location (Login button): "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation());
        System.out.println("Location X (Login button): "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation().getX());
        System.out.println("Location Y (Login button): "+ driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation().getY());


        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        System.out.println(driver.findElement(By.xpath(LocatorsCRM.headerLogin)).getText()); //Lấy ra tiêu đề trang Log in
        System.out.println("alertErrorMessage: " + driver.findElement(By.xpath(LocatorsCRM.alertErrorMessage)).isDisplayed());
        driver.get("https://anhtester.com/");
        System.out.println("isDisplayed (header page display:none):  "+ driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']")).isDisplayed());

    //Đóng trình duyệt
        driver.quit();
    }
}
