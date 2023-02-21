package passwordChange;

import login.BaseTestClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testingData.StandardData;

public class TC09_AdminPasswordChange extends BaseTestClass {

    private WebDriver driver;
    private String username;
    private String password;
    private String newPassword;
    private String confirmNewPassword;

    @BeforeMethod
    public void setUpTest() {
        driver = setUpDriver();
        username = StandardData.ADMIN_USERNAME;
        password = StandardData.ADMIN_PASSWORD;
        newPassword = StandardData.NEW_PASSWORD;
        confirmNewPassword = StandardData.CONFIRM_NEW_PASSWORD;
    }

    @Test
    public void PasswordChange(){

        pages.PasswordChange passwordChange = new pages.PasswordChange(driver).open();

        passwordChange.typeUsername1(username).typePassword1(password).typeNewPassword1(newPassword).confirmNewPassword1(confirmNewPassword).clickLoginButton5();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownTest(){ quitDriver(driver);
    }
}
