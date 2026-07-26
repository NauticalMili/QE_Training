package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity5Steps extends Base {

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        driver.get("https://training-support.net/webelements/login-form/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
    }

    @When("user enters {string} and {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(username);

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("clicks the submit button")
    public void clicksTheSubmitButton() {
        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/form/button")).click();
    }

    @Then("get the confirmation text and verify message as {string}")
    public void verifyErrorMessage(String expectedMessage) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/main/div/div/div/div/div")));
        String actualMessage = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div")).getText();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}
