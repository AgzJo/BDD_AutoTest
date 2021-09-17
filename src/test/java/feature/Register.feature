Feature:Register to nop commerce and login with multiple user email and Password

  Background: Navigate to url and goto register page
    Given user navigate to url "https://demo.nopcommerce.com/"
    Then user should be navigated to homepage

    @Register
  Scenario:Verify Registration functionality with valid credentials
     When user should click on the register link in the nav bar
     Then user should be navigated to the register Page
     When user enters firstName lastName email password confirmPassword
       | firstName | lastName | email              | password | confirmPassword |
       |  john      |  Agz     |  test5@nocomp.com  |  abc123 |     abc123      |
     And user to select the day in drop down "25"
     And user should select the month in the drop down "3"
     And user should select the year in the drop down "1995"
     And user click on the register button
    Then user should see the message "Your registration completed"
    Then user should logout from the web page

    @login @MultipleUser
    Scenario Outline:Verify login functionality for multiple user
      When user should click on the login link in the nav bar
      Then user should be navigated to login page
      When user enter email as "<email>"
      And  user enter password as "<password>"
      And  user click on the login button
      Then user should successfully login to the webpage
  Examples:
  | email            | password|
  | test1@nocomp.com | abd123 |
  | test2@nocomp.com | dgf456 |
  | test3@nocomp.com | qwe 098|

