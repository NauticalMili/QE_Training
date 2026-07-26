package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity5 {

    @Test
    public void getNavigationMenuColor() {

        WebDriver driver = new FirefoxDriver();

        // Open site
        driver.get("https://alchemy.hguy.co/crm");

        // Login
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        // Locate navigation menu (top bar)
        WebElement navMenu = driver.findElement(By.className("navbar-inverse"));

        // Get background color
        String bgColor = navMenu.getCssValue("background-color");

        // Print color
        System.out.println("Navigation menu color: " + bgColor);

        // Close browser
        driver.quit();
    }
}
