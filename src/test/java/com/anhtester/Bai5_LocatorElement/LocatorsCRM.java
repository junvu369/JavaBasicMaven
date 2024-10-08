package com.anhtester.Bai5_LocatorElement;

public class LocatorsCRM {

    //Login page
    public static String headerLogin = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String checkboxRememberMe = "//input[@id='remember']"; //HTML là thẻ input nhưng giao diện là checkbox nên đặt tên biến là checkbox
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']"; //Forgot Password là key text, ít khi thay đổi (giao diện hiện là link nên đặt tên biến là link
    public static String alertErrorMessage = "//div[@id='alerts']/div";

    //Dashboard page
    //Hàm wait for element visible: xác định element hiển thị đầy đủ
    public static String menuDashboard = "//span[normalize-space()='Dashboard']";
    public static String menuCustomers = "//span[normalize-space()='Customers']";
    public static String iconProfile = "//li[contains(@class,'header-user-profile')]";

    public static String totalInvoicesAwaitingPayment = "(//span[normalize-space()='Invoices Awaiting Payment']/parent::div)/following-sibling::span";
    public static String totalConvertedLeads = "(//span[normalize-space()='Converted Leads']/parent::div)/following-sibling::span";
    public static String totalProjectsInProgress = "(//span[normalize-space()='Projects In Progress']/parent::div)/following-sibling::span";
    public static String totalTasksNotFinished = "(//span[normalize-space()='Tasks Not Finished']/parent::div)/following-sibling::span";

    //Customer page
    public static String headerCustomer = "//span[normalize-space()='Customers Summary']";


}
