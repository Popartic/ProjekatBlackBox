package pages;

import org.openqa.selenium.WebDriver;
import testingData.StandardData;

public class Logout extends BasePageClass{
    private final String logoutURL = StandardData.LOGOUT_URL;

    public Logout(WebDriver driver) {super(driver);}

    public Logout open(){
        openUrl(logoutURL);
        return this;
    }
}
