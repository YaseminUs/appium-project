package utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverSetup implements Cloneable {

    private static AndroidDriver<AndroidElement>driver;

    public static AndroidDriver<AndroidElement> setUpAppiumAppDriver() throws MalformedURLException {
        File myApk = new File("src/test/java/General-Store.apk");

        if (driver != null) {
            return driver;
        } else {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Yasemin");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
            desiredCapabilities.setCapability(MobileCapabilityType.APP, myApk.getAbsolutePath());

            // it running from local host which is 127.0.0.1:4723
            URL appiumServer = new URL("http://127.0.0.1:4723/wd/hub");
            // then set our driver
            AndroidDriver<AndroidElement> driver = new AndroidDriver(appiumServer, desiredCapabilities);

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            return driver;

        }
    }
    @Override
    public Object clone(){
        throw  new RuntimeException("Sorry you can not clone it");
    }

}