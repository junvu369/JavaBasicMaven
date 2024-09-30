package com.anhtester.Bai5_LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathTuongDoi_1_5 {
    public static void main(String[] agrs) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);

//        System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText());

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//        System.out.println(driver.findElement(By.xpath("//span[contains(normalize-space(),'Invoices Awaiting Payment')]")).getText());
//        System.out.println(driver.findElement(By.xpath("//span[starts-with(normalize-space(),'Invoices Awaiting')]")).getText());


        //02 cách tìm element Forgot password?
//        driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
//        driver.findElement(By.xpath("//a[@href='https://crm.anhtester.com/admin/authentication/forgot_password']")).click();

        //Dung thực hành 30/09/2024

//        driver.findElement(By.xpath("(//li[contains(@class,'menu-item')])[3]")).click();
//        driver.findElement(By.xpath("(//span[contains(@class,'sub-menu-text')])[1]")).click();
//        driver.findElement(By.xpath("(//a[@href='https://crm.anhtester.com/admin/proposals/proposal'])[2]")).click();

        //Thầy viết 30/09/2024+Dung thực hành tiếp
        driver.findElement(By.xpath("//ul[@id='side-menu']/li[contains(@class,'menu-item')]")).click(); //Trừ icon ở header ra.
        driver.findElement(By.xpath("(//ul[@id='side-menu']/li[contains(@class,'menu-item')])[3]")).click(); //giống dòng thứ 36 của Dung
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[contains(@class,'sub-menu-text')])[1]")).click();
        driver.findElement(By.xpath("(//a[@href='https://crm.anhtester.com/admin/proposals/proposal'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Proposal to reduce the tax");
        Thread.sleep(1000);




//     Chuyển đổi từ Xpath tuyệt đối sang tương đối
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//a[@href='https://crm.anhtester.com/admin/clients']")).click(); //Click vào Customer.
//        driver.findElement(By.xpath("(//a[@href='https://crm.anhtester.com/admin/clients/client'])[2]")).click(); //Click vào (+New Customer).
//        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Công ty TNHH Selenium");
//        driver.findElement(By.xpath("//input[@id='vat']")).sendKeys("11223344");
//        driver.findElement(By.xpath("//input[@id='phonenumber']")).sendKeys("0123456789");
//        driver.findElement(By.xpath("(//button[normalize-space()='Save'])[2]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//a[contains(normalize-space(),'Billing & Shipping')]")).click();
//        driver.findElement(By.xpath("//a[starts-with(normalize-space(),'Billing')]")).click();
//        Thread.sleep(1000);


        driver.quit();
    }
}
