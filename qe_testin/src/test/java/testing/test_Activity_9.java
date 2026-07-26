package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_Activity_9 {

    WebDriver driver;
    Alert alert;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/webelements/alerts");
    }

    @BeforeMethod
    public void switchBackToPage() {
        driver.switchTo().defaultContent();
    }

    @Test
    public void simpleAlertTestCase() {
        driver.findElement(By.id("simple")).click();
        alert = driver.switchTo().alert();

        String text = alert.getText();
        System.out.println(text);
        Reporter.log(text, true);

        alert.accept();
        Assert.assertTrue(text.contains("Simple Alert"));
    }

    @Test
    public void confirmAlertTestCase() {
        driver.findElement(By.id("confirm")).click();
        alert = driver.switchTo().alert();

        String text = alert.getText();
        System.out.println(text);
        Reporter.log(text, true);

        alert.dismiss();
        Assert.assertTrue(text.contains("Confirm Alert"));
    }

    @Test
    public void promptAlertTestCase() {
        driver.findElement(By.id("prompt")).click();
        alert = driver.switchTo().alert();

        alert.sendKeys("Pranshu");
        String text = alert.getText();
        System.out.println(text);
        Reporter.log(text, true);

        alert.accept();
        Assert.assertTrue(text.contains("Prompt Alert"));
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}