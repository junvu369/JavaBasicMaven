package com.anhtester.Bai7_Webdriver;

import com.anhtester.Bai5_LocatorElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class DemoFindElements {
    public static void main(String[] args) {

        WebDriver driver;
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@id='side-menu']/li[contains(@class,'menu-item')]"));
        System.out.println("Menu total: " + listMenu.size());
        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i));
        }

        //Đóng trình duyệt
        driver.quit();
    }
}
