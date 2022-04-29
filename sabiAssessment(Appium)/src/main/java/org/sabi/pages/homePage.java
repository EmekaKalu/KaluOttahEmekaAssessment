package org.sabi.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    public homePage(AndroidDriver<AndroidElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Buy']")
    public WebElement buyBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lagos']")
    public WebElement pickState;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text ='Search for a product']")
    public WebElement searchCup;
    @AndroidFindBy(uiAutomator = "text(\"CUP\")")
    public WebElement pickProduct;

//    public By scroll(){
//        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>();
//        TouchActions tAction = new TouchActions(driver);
//        tAction.scroll(183, 744);
//        tAction.perform();
//        return null;
//    }
}
