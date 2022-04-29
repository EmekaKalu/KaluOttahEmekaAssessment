package org.sabi;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.screenrecording.BaseStartScreenRecordingOptions;
import org.apache.commons.io.FileUtils;
import org.sabi.pages.addToCart;
import org.sabi.pages.homePage;
import org.sabi.pages.landingPage;
import org.sabi.pages.loginPage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Base64;

import static org.sabi.dcap.capabilities;

public class Main {
    public static void main(String[] args) throws IOException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.startRecordingScreen(new AndroidStartScreenRecordingOptions().withVideoSize("1280x720").withTimeLimit(Duration.ofSeconds(200)));
        landingPage landPage = new landingPage(driver);
        loginPage logpage = new loginPage(driver);
        homePage hompage = new homePage(driver);
        addToCart addCart = new addToCart(driver);

        landPage.getStarted.click();
        logpage.phoneNumberField.sendKeys("08012345678");
        logpage.continueBtn.click();
        logpage.pin.click();
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        logpage.logInBtn.click();
        hompage.buyBtn.click();
        hompage.pickState.click();
        hompage.searchCup.click();
        hompage.searchCup.sendKeys("Cup");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        hompage.pickProduct.click();
        //addCart.skip.click();
        addCart.addToCartBtn.click();
        addCart.addToCartBtn.click();

        String video = driver.stopRecordingScreen();
        byte[] decode = Base64.getDecoder().decode(video);
        FileUtils.writeByteArrayToFile(new File("C:\\Users\\KALU\\Documents\\SabiAssessment\\sabiAssessment(Appium)\\sabiAssessment.mp4"), decode);
        driver.quit();
    }
}