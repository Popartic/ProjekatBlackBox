package pages;

import org.openqa.selenium.WebDriver;
import testingData.StandardData;
import testingData.TimeDelay;

public class AutorPage extends BasePageClass{

    public AutorPage(WebDriver driver) { super(driver); }

    public boolean verifyAutorPage() {
        return waitForUrlToChange(StandardData.INDEX_URL, TimeDelay.DELAY_3_SEC);

    }

}
