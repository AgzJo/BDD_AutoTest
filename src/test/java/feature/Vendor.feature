Feature:Register to nop commerce and login with multiple user email and Password


Scenario: Register for Vendor account
Navigate to url and goto register page
  Given user navigate to url "https://demo.nopcommerce.com/"
  Then user should be navigated to homepage
When user should click on the apply to vendor in the homepage
Then user should navigate to Vendor Account page
When user should enter vendorName email
And  user should click on submit
Then user should successfully register vendor account
