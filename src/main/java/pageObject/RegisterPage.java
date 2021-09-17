package pageObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage
{
    WebDriverWait Wait = new WebDriverWait(BasePage.driver,30 );
    WebDriver driver;
    @FindBy(id = "FirstName")
    public WebElement enterFirstName;
    @FindBy(id = "LastName")
    public WebElement enterLastName;
    @FindBy (name = "DateOfBirthDay")
    public WebElement DoB;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement DoM;
    @FindBy(name = "DateOfBirthYear")
    public WebElement DoY;
    @FindBy(id = "Email")
    public WebElement enterEml;
    @FindBy(id = "Password")
    public WebElement PW;
    @FindBy(id = "ConfirmPassword")
    public WebElement ConfrmPW;
    @FindBy(id = "register-button")
    public WebElement RegBT;
    @FindBy(className = "result")
    public WebElement RegisterSuccessful;

    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void FirstNM(String S)
    {
        enterFirstName.sendKeys(S);
    }

    public void LastNM(String S)
    {
        enterLastName.sendKeys(S);
    }

    public void Dateofbirth(String Day) {
        Select day = new Select(DoB);
        day.selectByValue(Day);
    }
    public void DateofMonth(String Month)
    {
        Select month = new Select(DoM);
        month.selectByValue(Month);
    }
    public void DateOfYear(String Year)
    {
        Select year = new Select(DoY);
        year.selectByValue(Year);
    }
    public void EM(String S)
    {
        enterEml.sendKeys(S);
    }

    public void PassW(String S){
        PW.sendKeys(S);
    }

    public void ConPW(String S)
    {
        ConfrmPW.sendKeys(S);
    }
    public void RegButn()
    {
        RegBT.click();
    }

    public void RegtSuc(){RegisterSuccessful.getText();}
}
