package org.sabi.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class addToCart {
    public addToCart(AndroidDriver<AndroidElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Skip']")
    public WebElement skip;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add to cart']")
    public WebElement addToCartBtn;
}
