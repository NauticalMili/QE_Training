from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 10)

driver.get("https://training-support.net/webelements/dynamic-content")
print(driver.title)

gen_button = driver.find_element(By.ID, "genButton")
gen_button.click()

word = driver.find_element(By.ID, "word")

wait.until(EC.text_to_be_present_in_element(word, "release"))
print("Word is:", word.text)

driver.quit()
