package login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Login;
import testingData.StandardData;

public class TC04_SluzbenikLogin extends BaseTestClass{

    private WebDriver driver;
    private String username;
    private String password;

    @BeforeMethod
    public void setUpTest(){
        driver = setUpDriver();
        username = StandardData.SLUZBENIK_USERNAME;
        password = StandardData.SLUZBENIK_PASSWORD;
    }
    @Test
    public void SluzbenikLoginSuccessful(){
        Login login = new Login(driver).open();

        login.typeUsername(username).typePassword(password).clickLoginButton3();
        String title = login.getTitle();
        Assert.assertEquals(title,"Anketa");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownTest(){ quitDriver(driver);
    }

}
