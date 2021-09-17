package pageObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
    WebDriver driver;
    @FindBy(linkText = "Register")
    public WebElement Regis;
    @FindBy(linkText = "Log in")
    public WebElement clickLogin;
    @FindBy(linkText = "Log out")
    WebElement LGout;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void LGclick()
    {
        clickLogin.click();
    }
    public void ClickReg()
    {
        Regis.click();
    }

    public void clickLogout()
    {
        LGout.click();
    }
}
