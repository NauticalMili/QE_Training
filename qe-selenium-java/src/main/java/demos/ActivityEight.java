package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActivityEight {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/mouse-events");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        Actions actions = new Actions(driver);

        Thread.sleep(2000);

        WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        actions.moveToElement(cargoLock).click().perform();

        Thread.sleep(1000);

        String confirmation1 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(confirmation1);

        WebElement src = driver.findElement(By.xpath("//h1[text()='src']"));
        actions.doubleClick(src).perform();

        Thread.sleep(1000);

        String confirmation2 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(confirmation2);

        driver.quit();
    }
}
