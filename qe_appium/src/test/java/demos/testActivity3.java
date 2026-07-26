package demos;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class testActivity3 {
    private AndroidDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException, URISyntaxException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setNoReset(true);
        options.setFullReset(false);
        options.setAppActivity("com.google.android.dialer");

        URL serverURL = new URI("http://127.0.0.1:4723").toURL();
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void multiplyTest() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.xpath(
                        "(//android.widget.LinearLayout[@resource-id=\"com.google.android.dialer:id/navigation_bar_item_content_container\"])[3]")));
        driver.findElement(AppiumBy.xpath(
                "(//android.widget.LinearLayout[@resource-id=\"com.google.android.dialer:id/navigation_bar_item_content_container\"])[3]"))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.xpath(
                        "//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/contact_name\" and @text=\"Create new contact\"]")));

        driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/contact_name\" and @text=\"Create new contact\"]"))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.xpath("//android.widget.EditText[@text=\"First name\"]")));

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"First name\"]")).sendKeys("Aaditya");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Last name\"]")).sendKeys("Varma");
        driver.findElement(AppiumBy.xpath(
                "//android.widget.EditText[@text=\"+1\"]"))
                .sendKeys("999148292");

        driver.findElement(AppiumBy.xpath(
                "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"))
                .click();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
