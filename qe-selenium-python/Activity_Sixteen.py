from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select

driver = webdriver.Firefox()

driver.get("https://training-support.net/webelements/selects")
driver.maximize_window()

print(driver.title)

dropdown = driver.find_element(By.TAG_NAME, "select")
select = Select(dropdown)

select.select_by_visible_text("One")
select.select_by_index(2)
select.select_by_value("three")

print("All dropdown options:")
for option in select.options:
    print(option.text)

driver.quit()
