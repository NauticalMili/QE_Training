from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/drag-drop")
driver.maximize_window()

print(driver.title)

actions = ActionChains(driver)

ball = driver.find_element(By.ID, "ball")
dropzone1 = driver.find_element(By.ID, "dropzone1")
dropzone2 = driver.find_element(By.ID, "dropzone2")


actions.drag_and_drop(ball, dropzone1).perform()
dropped = driver.find_element(By.XPATH, "//div[@id='dropzone1']//span")
if (dropped.text == "Dropped!"):
    print("dropzone one cleared")
actions.drag_and_drop(ball, dropzone2).perform()
dropped = driver.find_element(By.XPATH, "//div[@id='dropzone2']//span")
if (dropped.text == "Dropped!"):
    print("dropzone two cleared")