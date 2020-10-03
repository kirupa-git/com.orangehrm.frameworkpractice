package com.orangehrm.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class forloginorangehrm {

    @FindBy(id = "txtUsername")
    public static WebElement username;


    @FindBy(id = "txtPassword")
    public static WebElement password;

    @FindBy(id = "btnLogin")
    public static WebElement loginbutton;

    @FindBy(xpath = "//*[@id='task-list-group-panel-menu_holder']/table/tbody/tr/td/a")
    public static List<WebElement> listofleaverequest;
}
