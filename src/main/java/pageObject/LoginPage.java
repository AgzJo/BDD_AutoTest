package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;
    @FindBy(linkText = "Log in")
    WebElement LGlink;
    @FindBy(id = "Email")
    WebElement enterEmail;
    @FindBy(id = "Password")
    WebElement enterPW;
    @FindBy(id = "Log in")
    WebElement ClickLoginButn;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void LGck()
    {
        LGlink.click();
    }
    public void EML(String mail)
    {
     enterEmail.sendKeys(mail);
    }

    public void EnterPassword(String passW)
    {
        enterPW.sendKeys(passW);
    }
    public void Log()
    {
        ClickLoginButn.click();
    }

}
