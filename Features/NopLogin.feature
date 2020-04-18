Feature: Login

Scenario: Successfully login with valid credentials
		Given: Launch Chrome Browser
		When: Open URL "https://admin-demo.nopcommerce.com/login"
		And: Enter userid as "admin@yourstore.com" and password as "admin"
		And: Click on Login 
		Then: Page Title should be "Dashboard / nopCommerce administration"
		When: Click on Logout
		Then: Page Title should be "Your store. Login"
		And: Close Browser