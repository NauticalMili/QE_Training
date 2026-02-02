package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ActivitySeventeen {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        WebElement multiSelectElement = driver.findElement(By.xpath("//select[@multiple]"));
        Select multiSelect = new Select(multiSelectElement);

        multiSelect.selectByVisibleText("HTML");

        multiSelect.selectByIndex(3);
        multiSelect.selectByIndex(4);
        multiSelect.selectByIndex(5);

        multiSelect.selectByValue("nodejs");

        multiSelect.deselectByIndex(4);

        driver.quit();
    }
}
