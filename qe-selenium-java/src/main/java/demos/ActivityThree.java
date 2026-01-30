package demos;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityThree {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/login-form");
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        driver.quit();

    }

}