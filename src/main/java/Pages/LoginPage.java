package Pages;

import HelfMethoden.LoadData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;


///für Login schreibt mann alle mögliche bottun oder felder oder .....
//mithilfe von xpath oder id oder class......
public class LoginPage extends MainPageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String Email = LoadData.userData.getProperty("Email");
    String Password = LoadData.userData.getProperty("Password");
    //Login Click
    @FindBy(className = "ico-login")
    WebElement login;

    //Email-Login Eingabe
    @FindBy(id = "Email")
    WebElement EmailLogin;

    @FindBy(id = "Password")///----------------
    WebElement PassWordLogin;

    @FindBy(className = "login-button")
    WebElement loginButton;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement loginisDisplayed;

    public void login() {
        login.click();
        login.isDisplayed();
        login.isEnabled();
        EmailLogin.sendKeys(Email);
        PassWordLogin.sendKeys(Password);
        loginButton.isDisplayed();
        loginButton.isEnabled();
        loginButton.click();
        if (loginisDisplayed.isDisplayed() && loginisDisplayed.isEnabled()) {
            System.out.println("login ist verified");
        }
    }
}