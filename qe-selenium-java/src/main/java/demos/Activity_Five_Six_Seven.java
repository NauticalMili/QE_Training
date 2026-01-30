package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_Five_Six_Seven {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        System.out.println("Checkbox");
        System.out.println(driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed());
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed());
        System.out.println();

        if (!driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed())
            driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();

        System.out.println("Check if Box Is Clicked");
        System.out.println(driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected());
        driver.findElement(By.xpath("//input[@id='checkbox']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected());
        System.out.println();

        System.out.println("Text Input");
        System.out.println(driver.findElement(By.xpath("//input[@id='textInput']")).isEnabled());
        driver.findElement(By.xpath("//button[text()='Enable Input']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='textInput']")).isEnabled());
        System.out.println();

        driver.quit();

    }
}
