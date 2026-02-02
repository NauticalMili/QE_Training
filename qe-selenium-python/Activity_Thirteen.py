from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()

driver.get("https://training-support.net/webelements/tables")
driver.maximize_window()

print(driver.title)

rows = driver.find_elements(By.XPATH, "//table//tr")
print("Number of rows:", len(rows))

columns = driver.find_elements(By.XPATH, "//table//tr[1]/td")
print("Number of columns:", len(columns))

print("Values in the third row:")
third_row_cells = driver.find_elements(By.XPATH, "//table//tr[3]/td")

for cell in third_row_cells:
    print(cell.text)

value = driver.find_element(By.XPATH, "//table//tr[2]//td[2]").text
print("Value at 2nd Row, 2nd Column:", value)

driver.quit()
