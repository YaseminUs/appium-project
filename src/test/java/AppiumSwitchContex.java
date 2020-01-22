import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.DriverSetup;

import java.net.MalformedURLException;

public class AppiumSwitchContex {

    private static AndroidDriver<AndroidElement> driver;

    @Test
    public void switchIntro() throws MalformedURLException, InterruptedException {
        driver = DriverSetup.setUpAppiumAppDriver();

        AndroidElement nameField = driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
        nameField.sendKeys("Yasemin");

        AndroidElement loginButton = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
        loginButton.click();

        AndroidElement addCart = driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));
        addCart.click();
//
//        AndroidElement cart = driver.findElement(By.xpath("com."));
//        cart.click();

        AndroidElement webSite = driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed"));
        webSite.click();

        Thread.sleep(3000);

        System.out.println(driver.getContextHandles());
        driver.context("WEBVIEW_com.androidsample.generalstore");
    }
}

