package pages;

import org.openqa.selenium.*;
import org.testng.Assert;
import testingData.StandardData;
import testingData.TimeDelay;

public class Login extends BasePageClass{

    private final String LoginUrl = StandardData.LOGIN_URL;

    private final By usernameField = By.xpath("//input[@name='username1']");

    private final By passwordField = By.xpath("//input[@name='password1']");

    private final By loginButtonLocator = By.xpath("//button[@name='logindugme']");

    private final By loginWelcomeText = By.xpath("//h1[@align='center']");

    public Login(WebDriver driver) {
        super(driver);
    }

    public Login open() {
        openUrl(LoginUrl);
        return this;
    }

    public Login typeUsername(String username) {
        WebElement usernameTextField = waitForWebElementToBeVisible(usernameField, TimeDelay.DELAY_3_SEC);
        clearAndTypeTextToWebElement(usernameTextField, username);
        return this;
    }

    public Login typePassword(String password) {
        WebElement passwordTextField = waitForWebElementToBeVisible(passwordField, TimeDelay.DELAY_3_SEC);
        clearAndTypeTextToWebElement(passwordTextField, password);
        return this;
    }
    public AdminPage clickLoginButton() {
        clickButton(loginButtonLocator);
        AdminPage adminPage = new AdminPage(driver);
        return adminPage;
    }

    public AutorPage clickLoginButton1() {
        clickButton(loginButtonLocator);
        AutorPage autorPage = new AutorPage(driver);
        return autorPage;
    }

    public IspitanikPage clickLoginButton2() {
        clickButton(loginButtonLocator);
        IspitanikPage ispitanikPage = new IspitanikPage(driver);
        return ispitanikPage;
    }

    public SluzbenikPage clickLoginButton3() {
        clickButton(loginButtonLocator);
        SluzbenikPage sluzbenikPage = new SluzbenikPage(driver);
        return sluzbenikPage;
    }

    public Login verifyWelcomeText(String text){
        WebElement welcomeTextElement = (WebElement) loginWelcomeText;
        String welcomeText = getTextFromWebElement(welcomeTextElement);
        Assert.assertEquals(welcomeText, text);
        return this;
    }
    public String getTitle() {
        return driver.getTitle();
    }
    public Login verifyAlertText(String text) {
        try {
            waitForAlert();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            String alertText = alert.getText();
            Assert.assertEquals(alertText, text);
            alert.dismiss();
        } catch (NoAlertPresentException noAlert) {
            noAlert.getMessage();
        }
        return this;
    }


}
