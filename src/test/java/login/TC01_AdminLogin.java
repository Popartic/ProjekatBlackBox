package login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Login;
import testingData.StandardData;

public class TC01_AdminLogin extends BaseTestClass{

    private WebDriver driver;
    private String username;
    private String password;

    @BeforeMethod
    public void setUpTest(){
        driver = setUpDriver();
        username = StandardData.ADMIN_USERNAME;
        password = StandardData.ADMIN_PASSWORD;
    }

    @Test
    public void AdminLoginSuccessful(){
        Login login = new Login(driver).open();

        login.typeUsername(username).typePassword(password).clickLoginButton();
        //login.verifyWelcomeText(StandardData.LOGIN_PAGE_WELCOME_TEXT);
    }

    @Test
    public void AdminLoginFail() {
        Login login = new Login(driver).open();

        login.typeUsername(username);
        login.typePassword(StandardData.AUTOR_PASSWORD);
        login.clickLoginButton();
        login.verifyAlertText(StandardData.ALERT_TEXT);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownTest(){ quitDriver(driver);
    }

}
