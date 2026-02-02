from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.firefox.options import Options
from selenium.webdriver.firefox.webdriver import WebDriver
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.firefox.options import Options
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.firefox.webdriver import WebDriver
from selenium.webdriver.firefox.options import Options
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.firefox.webdriver import WebDriver
from selenium.webdriver.firefox.options import Options
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 10)

driver.get("https://training-support.net/webelements/dynamic-controls")
print(driver.title)

checkbox = driver.find_element(By.CSS_SELECTOR, "#checkbox")
toggle_btn = driver.find_element(By.XPATH, "//button[text()='Toggle Checkbox']")

toggle_btn.click()
wait.until(EC.invisibility_of_element(checkbox))

toggle_btn.click()

new_checkbox = wait.until(
    EC.visibility_of_element_located((By.CSS_SELECTOR, "#checkbox"))
)

new_checkbox.click()
print("Checkbox selected successfully!")

driver.quit()
