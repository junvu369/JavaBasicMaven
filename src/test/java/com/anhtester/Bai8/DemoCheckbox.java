package com.anhtester.Bai8;

import com.anhtester.Bai5_LocatorElement.LocatorsCRM;
import org.openqa.selenium.By;

public class DemoCheckbox extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        loginCRM();

        driver.findElement(By.xpath(LocatorsCRM.menuTasks)).click();
        driver.findElement(By.xpath(LocatorsCRM.buttonNewTask)).click();

        Thread.sleep(2000);
        //Click chọn checkbox Public
        driver.findElement(By.xpath("//input[@id='task_is_public']")).click();
        //driver.findElement(By.xpath("//label[normalize-space()='Public']")).click();

        //Kiểm tra checkbox đã được check hay chưa
        //driver.findElement(By.xpath("//input[@id='task_is_public']")).isSelected();

        boolean isSelected = driver.findElement(By.xpath("//input[@id='task_is_billable']")).isSelected();
        System.out.println("isSelected: " + isSelected);

        //Nếu chưa được check thì click vào ô check box đó
        if (isSelected == false) {
            System.out.println("Click chọn checkbox Public");
            driver.findElement(By.xpath("//input[@id='task_is_billable']")).click();
        }

        Thread.sleep(2000);
        closeDriver();
    }
}

