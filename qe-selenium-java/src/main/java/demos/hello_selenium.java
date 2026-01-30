package demos;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;

public class hello_selenium {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net");
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
