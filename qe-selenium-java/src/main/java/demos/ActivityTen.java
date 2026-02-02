package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActivityTen {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/drag-drop");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        Actions actions = new Actions(driver);
        WebElement ball = driver.findElement(By.id("ball"));
        WebElement dropzoneOne = driver.findElement(By.id("dropzone1"));
        WebElement dropzoneTwo = driver.findElement(By.id("dropzone2"));

        actions.dragAndDrop(ball, dropzoneOne).perform();
        if (driver.findElement(By.xpath("//div[@id='dropzone1']//span")).getText().equals("Dropped!"))
            System.out.println("Dropzone One Cleared!");
        actions.dragAndDrop(ball, dropzoneTwo).perform();
        if (driver.findElement(By.xpath("//div[@id='dropzone2']//span")).getText().equals("Dropped!"))
            System.out.println("Dropzone Two Cleared!");
        driver.quit();
    }

}
