package projects;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity2 {
    private AndroidDriver driver;
    private WebDriverWait wait;

    public void interactElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).click();
    }

    public void interactElement(By locator, String s) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(s);
    }

    public void interactElementLong(By locator) {
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));

        Point location = element.getLocation();

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence seq = new Sequence(finger, 1);
        seq.addAction(finger.createPointerMove(Duration.ofSeconds(2), PointerInput.Origin.viewport(), location))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofSeconds(1)))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(seq));

    }

    public void longPressElement(AppiumBy locator) {
        WebElement element = driver.findElement(locator);

        HashMap<String, Object> params = new HashMap<>();
        params.put("elementId", ((RemoteWebElement) element).getId());
        params.put("duration", 2000);
        driver.executeScript("mobile: longClickGesture", params);

    }

    public void longPressElementProper(AppiumBy locator) {
        WebElement element = driver.findElement(locator);
        Point location = element.getLocation();
        Dimension size = element.getSize();
        Point center = new Point(location.x + size.width / 2, location.y + size.height / 2);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence longPress = new Sequence(finger, 1);

        longPress
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), center.x, center.y));
        longPress.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        longPress.addAction(new Pause(finger, Duration.ofSeconds(2)));
        longPress.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(longPress));
    }

    public void scrollTo(int i) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence scroll = new Sequence(finger, 1);

        while(i>0)
        scroll.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 510, 2000));
        scroll.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), 510, 500));
        scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(scroll));
        i--;
    }
    

    void addToList(String s) {
        interactElement(By.xpath("//android.widget.EditText[@resource-id=\"todo-input\"]"), s);
        interactElement(By.xpath("//android.widget.Button[@resource-id=\"todo-add\"]"));
    }

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
        scrollTo(3);
        interactElement(
                AppiumBy.xpath("//android.view.View[@content-desc=\"To-Do List Elements get added at runtime!\"]"));

        addToList("Add tasks to list");
        addToList("Get number of tasks");
        addToList("Clear the list");

        for (int i = 3; i < 6; i++)
            interactElement(AppiumBy.xpath("//android.widget.ListView/android.view.View[" + i
                    + "]/android.view.View/android.widget.CheckBox"));

        List<WebElement> checkBoxes = driver.findElements(
                AppiumBy.className("android.widget.CheckBox"));

        Assert.assertEquals(checkBoxes.size(), 5, "Checkbox count mismatch!");

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
