from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Firefox()

driver.get("https://training-support.net/webelements/tables")
driver.maximize_window()

print(driver.title)

print("Number of rows:", len(driver.find_elements(By.XPATH, "//table//tr")))
print("Number of columns:", len(driver.find_elements(By.XPATH, "//table//tr[1]/td")))

before = driver.find_element(By.XPATH, "//table//tr[5]//td[2]").text
print("Book Name in Fifth Row:", before)

actions = ActionChains(driver)
actions.click(driver.find_element(By.XPATH, "//table//thead//tr[1]//th[5]")).perform()

after = driver.find_element(By.XPATH, "//table//tr[5]//td[2]").text
print("Book Name in Fifth Row:", after)

driver.quit()
    