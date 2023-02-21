package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testingData.StandardData;
import testingData.TimeDelay;

public class PasswordChange extends BasePageClass{

    private final String NewPasswordUrl = StandardData.NEW_PASSWORD_URL;

    private final By usernameField1 = By.xpath("//input[@name='username3']");

    private final By passwordField1 = By.xpath("//input[@name='password3']");

    private final By newPasswordField1 = By.xpath("//input[@name='newpass']");

    private final By confirmNewPasswordField1 = By.xpath("//input[@name='newpass1']");

    private final By loginButtonLocator1 = By.xpath("//button[@name='novalozdugme']");

    public PasswordChange(WebDriver driver) {super(driver);}

    public PasswordChange open(){
        openUrl(NewPasswordUrl);
        return this;
    }
    public PasswordChange typeUsername1(String username) {
        WebElement usernameTextField = waitForWebElementToBeVisible(usernameField1, TimeDelay.DELAY_3_SEC);
        clearAndTypeTextToWebElement(usernameTextField, username);
        return this;
    }
    public PasswordChange typePassword1(String password) {
        WebElement passwordTextField = waitForWebElementToBeVisible(passwordField1, TimeDelay.DELAY_3_SEC);
        clearAndTypeTextToWebElement(passwordTextField, password);
        return this;
    }
    public PasswordChange typeNewPassword1(String newPassword) {
        WebElement passwordTextField = waitForWebElementToBeVisible(newPasswordField1, TimeDelay.DELAY_3_SEC);
        clearAndTypeTextToWebElement(passwordTextField,newPassword );
        return this;
    }
    public PasswordChange confirmNewPassword1(String confirmNewPassword) {
        WebElement passwordTextField = waitForWebElementToBeVisible(confirmNewPasswordField1, TimeDelay.DELAY_3_SEC);
        clearAndTypeTextToWebElement(passwordTextField, confirmNewPassword);
        return this;
    }
    public IspitanikPage clickLoginButton4() {
        clickButton(loginButtonLocator1);
        IspitanikPage ispitanikPage = new IspitanikPage(driver);
        return ispitanikPage;
    }
    public AdminPage clickLoginButton5() {
        clickButton(loginButtonLocator1);
        AdminPage adminPage = new AdminPage(driver);
        return adminPage;
    }
    public AutorPage clickLoginButton6() {
        clickButton(loginButtonLocator1);
        AutorPage autorPage = new AutorPage(driver);
        return autorPage;
    }
    public SluzbenikPage clickLoginButton7(){
        clickButton(loginButtonLocator1);
        SluzbenikPage sluzbenikPage = new SluzbenikPage(driver);
        return  sluzbenikPage;
    }

}
