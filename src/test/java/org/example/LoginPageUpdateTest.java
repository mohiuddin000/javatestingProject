package org.example;

import com.browser.Factorybrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageUpdateTest {
    @Test
    public void verifyLoginTest(){
        WebDriver driver;
        driver= Factorybrowser.setupbrowser("chrome","https://cloud.google.com/");
        //driver= Factorybrowser.setupbrowser("chrome","https://cloud.google.com/s/results?q=%22Google%20Cloud%20Platform%20Pricing%20Calculator&text=%22Google%20Cloud%20Platform%20Pricing%20Calculator");
        PageFactory.initElements(driver, LoginPageUpdate.class);

        LoginPageUpdate loginPageUpdate=new LoginPageUpdate(driver);
        loginPageUpdate.loginwebsite();
    }
}
