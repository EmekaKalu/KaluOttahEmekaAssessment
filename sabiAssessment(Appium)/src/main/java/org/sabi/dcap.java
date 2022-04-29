package org.sabi;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class dcap {
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "42005fc5c62716ed");
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\KALU\\Documents\\SabiAssessment\\sabiAssessment(Appium)\\src\\Sabi-83cde12d18284885a40855139fac6aea-signed.apk");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        cap.setCapability("appPackage","com.spaceso2o.superapp");
        cap.setCapability("appActivity","host.exp.exponent.LauncherActivity");
        cap.setCapability("noReset","true");


        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        return driver;
    }
}
