from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    #navigate to browser
    driver.get("https://www.training-support.net")

print("Title of the page is: {driver.title}")
about_us_link= driver.find_element(By.ID,"about-link")
about_us_link= driver.find_element(By.CLASS_NAME,"green")
about_us_link= driver.find_element(By.LINK_TEXT,"About Us")
about_us_link= driver.find_element(By.CSS_SELECTOR,"green")
print(about_us_link.text)
about_us_link.click()
driver.quit()
