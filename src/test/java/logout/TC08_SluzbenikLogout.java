package logout;

import login.BaseTestClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Login;
import pages.Logout;
import testingData.StandardData;

public class TC08_SluzbenikLogout extends BaseTestClass {
    private WebDriver driver;
    private String username;
    private String password;

    @BeforeMethod
    public void setUpTest() {
        driver = setUpDriver();
        username = StandardData.SLUZBENIK_USERNAME;
        password = StandardData.SLUZBENIK_PASSWORD;
    }
    @Test
    public void SuccessfullLogout() throws InterruptedException {
        Login login = new Login(driver).open();

        login.typeUsername(username).typePassword(password).clickLoginButton();
        Thread.sleep(2000);

        Logout logout = new Logout(driver).open();
        Thread.sleep(2000);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDownTest(){
        quitDriver(driver);
    }
}
