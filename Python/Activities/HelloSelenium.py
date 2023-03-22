from selenium import webdriver
#start the driver
with webdriver.Firefox() as driver:
    #navigate to browser
    driver.get("https://www.training-support.net")
    #close the browser
    driver.quit()