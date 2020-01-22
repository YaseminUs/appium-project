package stepDefs;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import utility.DriverSetup;

import java.net.MalformedURLException;

public class stepClass {

    AndroidDriver<AndroidElement> driver;
    @Before
    public void setup() throws MalformedURLException {
        driver= DriverSetup.setUpAppiumAppDriver();
    }

    @Given("^User launches the app$")
    public void user_launches_the_app() throws Throwable {

    }

    @When("^User input insufficient value$")
    public void user_input_insufficient_value() throws Throwable {
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

    }

    @Then("^Verify roast message is shown$")
    public void verify_roast_message_is_shown() throws Throwable {
        AndroidElement toastMessage = driver.findElement(By.xpath("//android.widget.Toast"));
        String errorMessage = toastMessage.getAttribute("name");
        Assert.assertEquals("Please enter your name",errorMessage);

    }
    @When("^User input his name$")
    public void user_input_his_name() throws Throwable {

        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Yasemin");

    }

    @Then("^Verify succsesfull login$")
    public void verify_succsesfull_login() throws Throwable {
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        Assert.assertTrue(driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).isDisplayed());
    }



    @Then("^User adds one item to cart$")
    public void user_adds_one_item_to_cart() throws Throwable {
        driver.findElement(By.className("android.widget.LinearLayout")).click();

    }

    @Then("^Verify the item is in the cart$")
    public void verify_the_item_is_in_the_cart() throws Throwable {

    }


}
