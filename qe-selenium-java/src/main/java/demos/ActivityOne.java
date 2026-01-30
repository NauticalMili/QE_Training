package demos;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityOne {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net");

        System.out.println(driver.getTitle());

        driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(200);

        System.out.println(driver.getTitle());

        driver.quit();
    }

}
