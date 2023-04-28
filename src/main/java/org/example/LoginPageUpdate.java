package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUpdate {

    WebDriver driver;

    @FindBy(xpath = "/html/body/section/devsite-header/div/div[1]/div/div/div[2]/devsite-search/form/div[1]/div/input")
    WebElement signin;

    @FindBy(xpath = "//*[@id=\"___gcse_0\"]/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/a/b")
    WebElement pass;


    public LoginPageUpdate(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void loginwebsite()
    {
        signin.click();
        signin.sendKeys("Google Cloud Platform Pricing Calculator");
        signin.sendKeys(Keys.ENTER);
        pass.click();
    }

}
