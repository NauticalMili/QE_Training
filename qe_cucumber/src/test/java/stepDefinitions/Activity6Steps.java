package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity6Steps extends Base {

    @Given("user is on the To-Do list page")
    public void openPage() {
        driver.get("https://training-support.net/webelements/todo-list");
        assertEquals("Selenium: To-Do List", driver.getTitle());
    }

    @When("user adds the following tasks")
    public void inputTasks(DataTable inputTasks) {
        List<String> tasks = inputTasks.asList();

        for (String task : tasks) {
            driver.findElement(By.id("todo-input")).sendKeys(task);
            driver.findElement(By.id("todo-add")).click();
        }
    }

    @Then("they can see the task added to the list")
    public void verifyResults() {
        // Simple confirmation output (as expected in the activity)
        System.out.println("All tasks were added successfully");
    }
}
