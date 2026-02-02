from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 10)

driver.get("https://training-support.net/webelements/dynamic-attributes")
driver.maximize_window()

print(driver.title)

driver.find_element(By.XPATH, "//input[starts-with(@id,'full-name')]") \
    .send_keys("Milind Nautiyal")

driver.find_element(By.XPATH, "//input[contains(@id,'email')]") \
    .send_keys("milind.nautiyal@gmail.com")

driver.find_element(By.XPATH, "//input[@type='date']") \
    .send_keys("2003-01-20")

driver.find_element(By.XPATH, "//textarea[contains(@id,'additional-details')]") \
    .send_keys("hello, my name is Milind.")

driver.find_element(By.XPATH, "//button[text()='Submit']").click()

confirmation = wait.until(
    EC.visibility_of_element_located((By.XPATH, "//h3[@id='action-confirmation']"))
)

print("Confirmation message:", confirmation.text)

driver.quit()
