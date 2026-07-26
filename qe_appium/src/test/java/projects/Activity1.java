package projects;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
    private AndroidDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException, URISyntaxException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setApp("C:/Users/MilindNautiyal/Desktop/training/qe_appium/src/main/resources/ts-todo-list-v1.apk");
        options.setNoReset(true);
        options.setFullReset(false);

        URL serverURL = new URI("http://127.0.0.1:4723").toURL();
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

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

    @Test
    public void multiplyTest() {
        interactElement(
                AppiumBy.xpath("//android.widget.ImageButton[@resource-id=\"com.app.todolist:id/fab_new_task\"]"));
        interactElement(
                AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.app.todolist:id/et_new_task_name\"]"),
                "Complete Activity 1");
        interactElement(
                AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.app.todolist:id/tv_new_task_priority\"]"));
        interactElement(AppiumBy.xpath(
                "//android.widget.ListView[@resource-id=\"android:id/select_dialog_listview\"]/android.widget.LinearLayout[1]"));
        interactElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.app.todolist:id/bt_new_task_ok\"]"));

        interactElement(
                AppiumBy.xpath("//android.widget.ImageButton[@resource-id=\"com.app.todolist:id/fab_new_task\"]"));
        interactElement(
                AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.app.todolist:id/et_new_task_name\"]"),
                "Complete Activity 2");
        interactElement(
                AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.app.todolist:id/tv_new_task_priority\"]"));
        interactElement(AppiumBy.xpath(
                "//android.widget.ListView[@resource-id=\"android:id/select_dialog_listview\"]/android.widget.LinearLayout[2]"));
        interactElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.app.todolist:id/bt_new_task_ok\"]"));

        interactElement(
                AppiumBy.xpath("//android.widget.ImageButton[@resource-id=\"com.app.todolist:id/fab_new_task\"]"));
        interactElement(
                AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.app.todolist:id/et_new_task_name\"]"),
                "Complete Activity 3");
        interactElement(
                AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.app.todolist:id/tv_new_task_priority\"]"));
        interactElement(AppiumBy.xpath(
                "//android.widget.ListView[@resource-id=\"android:id/select_dialog_listview\"]/android.widget.LinearLayout[3]"));
        interactElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.app.todolist:id/bt_new_task_ok\"]"));

        Assert.assertEquals(driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.app.todolist:id/tv_exlv_task_name\" and @text=\"Complete Activity 1\"]"))
                .getText(),
                "Complete Activity 1");
        Assert.assertEquals(driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.app.todolist:id/tv_exlv_task_name\" and @text=\"Complete Activity 2\"]"))
                .getText(),
                "Complete Activity 2");
        Assert.assertEquals(driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.app.todolist:id/tv_exlv_task_name\" and @text=\"Complete Activity 3\"]"))
                .getText(),
                "Complete Activity 3");

        interactElementLong(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.app.todolist:id/tv_exlv_task_name\" and @text=\"Complete Activity 1\"]"));

        interactElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"android:id/content\"])[1]"));
        interactElement(AppiumBy
                .xpath("//android.widget.TextView[@resource-id=\"com.app.todolist:id/tv_todo_list_deadline\"]"));
        interactElement(AppiumBy.xpath("//android.view.View[@content-desc=\"14 February 2026\"]"));
        interactElement(AppiumBy.id("com.app.todolist:id/bt_deadline_ok"));
        interactElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.app.todolist:id/bt_new_task_ok\"]"));
        Assert.assertEquals(driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.app.todolist:id/tv_exlv_task_deadline\" and @text=\"Deadline: 14.02.2026\"]"))
                .getText(), "Deadline: 14.02.2026");

        interactElement(
                AppiumBy.xpath("(//android.widget.CheckBox[@resource-id=\"com.app.todolist:id/cb_task_done\"])[3]"));
        interactElement(
                AppiumBy.xpath("(//android.widget.CheckBox[@resource-id=\"com.app.todolist:id/cb_task_done\"])[4]"));

        interactElementLong(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.app.todolist:id/tv_exlv_task_name\" and @text=\"Complete Activity 3\"]"));

        interactElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"android:id/content\"])[1]"));
        interactElement(
                AppiumBy.xpath("//android.widget.SeekBar[@resource-id=\"com.app.todolist:id/sb_new_task_progress\"]"),
                "50");
        interactElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.app.todolist:id/bt_new_task_ok\"]"));

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
