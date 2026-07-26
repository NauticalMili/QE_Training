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

public class testActivity2 {
    private AndroidDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException, URISyntaxException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");

        options.setNoReset(true);
        options.setFullReset(false);
        options.setCapability("appium:forceAppLaunch", true);
        options.setCapability("appium:shouldTerminateApp", false);
        options.setAppActivity("com.google.android.apps.chrome.main");

        URL serverURL = new URI("http://127.0.0.1:4723").toURL();
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net");

    }

    @Test
    public void checkHeading() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.view.View[@content-desc=\"About Us\"]")));

        String homeHeading = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Training Support']"))
                .getText();
        System.out.println(homeHeading);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
