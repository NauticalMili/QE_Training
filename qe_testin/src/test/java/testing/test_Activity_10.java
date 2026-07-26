package testing;

import org.testng.annotations.Test;
import org.testng.annotations.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;

public class test_Activity_10 {

    WebDriver driver;

    @DataProvider(name = "formData")
    public Object[][] getData() throws Exception {

        FileInputStream fis = new FileInputStream("src/test/java/resources/activity_10_sheet.xlsx");
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("FormData");

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rows - 1][cols];

        DataFormatter formatter = new DataFormatter();

        for (int i = 1; i < rows; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < cols; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = formatter.formatCellValue(cell);
            }
        }

        workbook.close();
        fis.close();
        return data;
    }

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/webelements/simple-form");
    }

    @Test(dataProvider = "formData")
    public void testSimpleForm(String fullName, String email, String date, String details) {

        driver.findElement(By.id("full-name")).sendKeys(fullName);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='event-date']")).sendKeys(date);
        driver.findElement(By.id("additional-details")).sendKeys(details);

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert message: " + alert.getText());
        alert.accept();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
