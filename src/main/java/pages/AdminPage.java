package pages;

import org.openqa.selenium.WebDriver;
import testingData.StandardData;
import testingData.TimeDelay;

public class AdminPage extends BasePageClass {

    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyAdminPage() {
        return waitForUrlToChange(StandardData.INDEX_URL, TimeDelay.DELAY_3_SEC);
    }
}
