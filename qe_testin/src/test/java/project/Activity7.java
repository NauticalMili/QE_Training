package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity7 {

    @Test
    public void readAdditionalInfoPopup() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        // Open site
        driver.get("https://alchemy.hguy.co/crm");

        // Login
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        // Navigate to Sales -> Leads
        driver.findElement(By.id("grouptab_0")).click(); // Sales
        driver.findElement(By.id("moduleTab_9_Leads")).click();

        // Small wait for table to load
        Thread.sleep(2000);

        // Click the Additional Information icon (first row)
        WebElement infoIcon = driver.findElement(
                By.xpath("//tr[1]//td[10]"));
        infoIcon.click();

        // Get phone number from popup
        WebElement phoneNumber = driver.findElement(
                By.className("phone"));

        System.out.println("Phone number: " + phoneNumber.getText());

        // Close browser
        driver.quit();
    }
}
