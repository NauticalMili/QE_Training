package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test_Activity_2 {

    WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice/");
        Thread.sleep(3000);
    }

    @Test
    public void testPageTitle() throws InterruptedException {
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        Assert.assertEquals(title, "Selenium: Target Practice");
        Thread.sleep(2000);
    }

    @Test
    public void testBlackButtonFailure() throws InterruptedException {
        String buttonText = driver.findElement(By.xpath("//button[contains(@class, 'bg-slate-200')]")).getText();
        System.out.println("Black Button Text: " + buttonText);
        Assert.assertEquals(buttonText, "Wrong Text");
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void skippedByEnabledFalse() {
        System.out.println("This test will not run");
    }

    @Test
    public void skippedByException() {
        throw new SkipException("Skipping this test using SkipException");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}