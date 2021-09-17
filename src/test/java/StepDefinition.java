import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinition
{
    String HomePageExpectedTile="nopCommerce demo store";
    String HomePageActualTile;
    String RegisterPageExpectedTile="nopCommerce demo store. Register";
    String RegisterPageActualTile;
    String LoginPageExpectedTitle="nopCommerce demo store. Login";
    String LoginPageActualTitle;


    @Given("user navigate to url {string}")
    public void user_navigate_to_url(String url)
    {
        BasePage.navigatetoUrl(url);
    }

    @Then("user should be navigated to homepage")
    public void user_should_be_navigated_to_homepage()
    {
        HomePageActualTile= BasePage.GetPagetitle();
        Assertions.assertEquals(HomePageExpectedTile,HomePageActualTile);
    }

    @When("user should click on the register link in the nav bar")
    public void user_should_click_on_the_register_link_in_the_nav_bar()
    {
        BasePage.homePage.ClickReg();
    }

    @Then("user should be navigated to the register Page")
    public void user_should_be_navigated_to_the_register_page()
    {
        RegisterPageActualTile= BasePage.GetPagetitle();
        Assertions.assertEquals(RegisterPageExpectedTile,RegisterPageActualTile);
    }

    @When("user enters firstName lastName email password confirmPassword")
    public void user_enters_first_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable)
    {
     BasePage.registerPage.FirstNM(dataTable.cell(1,0));
     BasePage.registerPage.LastNM(dataTable.cell(1,1));
     BasePage.registerPage.EM(dataTable.cell(1,2));
     BasePage.registerPage.PassW(dataTable.cell(1,3));
     BasePage.registerPage.ConPW(dataTable.cell(1,4));
    }

    @And("user to select the day in drop down {string}")
    public void userToSelectTheDayInDropDown(String Day) { BasePage.registerPage.Dateofbirth(Day);
    }

    @And("user should select the month in the drop down {string}")
    public void userShouldSelectTheMonthInTheDropDown(String Month) {
        BasePage.registerPage.DateofMonth(Month);
    }

    @And("user should select the year in the drop down {string}")
    public void userShouldSelectTheYearInTheDropDown(String Year) {
        BasePage.registerPage.DateOfYear(Year);
    }

    @When("user click on the register button")
    public void user_click_on_the_register_button()
    {
        BasePage.registerPage.RegButn();
    }

    @Then("user should see the message {string}")
    public void user_should_see_the_message(String RegisterSuccess)
    {
        BasePage.registerPage.RegtSuc();
        Assertions.assertEquals(RegisterSuccess,RegisterPageActualTile);
    }
    @Then("user should logout from the web page")
    public void userShouldLogoutFromTheWebPage() {
        BasePage.homePage.clickLogout();    }



    @When("user should click on the login link in the nav bar")
    public void user_should_click_on_the_login_link_in_the_nav_bar()
    {
      BasePage.loginPage.LGck();
    }

    @Then("user should be navigated to login page")
    public void user_should_be_navigated_to_login_page()
    {
      LoginPageExpectedTitle = BasePage.GetPagetitle();
      Assertions.assertEquals(LoginPageExpectedTitle,LoginPageActualTitle);
    }
    @When("user enter email as {string}")
    public void user_enter_email_as(String email)
    {
      BasePage.loginPage.EML(email);
    }

    @When("user enter password as {string}")
    public void user_enter_password_as(String PassWrd)
    {
     BasePage.loginPage.EnterPassword(PassWrd);
    }

    @When("user click on the login button")
    public void user_click_on_the_login_button()
    {
      BasePage.loginPage.Log();
    }

    @Then("user should successfully login to the webpage")
    public void userShouldSuccessfullyLoginToTheWebpage() {
        LoginPageExpectedTitle = BasePage.GetPagetitle();
        Assertions.assertEquals(LoginPageActualTitle,LoginPageActualTitle);
    }
}
