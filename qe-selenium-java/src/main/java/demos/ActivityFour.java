package demos;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityFour {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/target-practice");
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        System.out.println("Third Header Text: "
                + driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText());
        System.out.println("Fifth Header Color: "
                + driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color"));

        System.out.println("Purple Button Classes: "
                + driver.findElement(By.cssSelector("button.bg-purple-200")).getAttribute("class"));
        System.out.println("Slate Button Text: " + driver.findElement(By.cssSelector("button.bg-slate-200")).getText());

        driver.quit();

    }

}