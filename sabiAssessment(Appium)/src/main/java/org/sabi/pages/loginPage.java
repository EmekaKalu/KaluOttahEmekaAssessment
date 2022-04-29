package org.sabi.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    public loginPage(AndroidDriver<AndroidElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement phoneNumberField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Continue']")
    public WebElement continueBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[6]")
    public WebElement pin;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Log In']")
    public WebElement logInBtn;
}
