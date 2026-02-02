from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/selects")
driver.maximize_window()

print(driver.title)

multi_select_element = driver.find_element(By.XPATH, "//select[@multiple]")
multi_select = Select(multi_select_element)

multi_select.select_by_visible_text("HTML")

multi_select.select_by_index(3)
multi_select.select_by_index(4)
multi_select.select_by_index(5)

multi_select.select_by_value("nodejs")

multi_select.deselect_by_index(4)

driver.quit()
