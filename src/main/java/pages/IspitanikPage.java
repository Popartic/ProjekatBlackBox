package pages;

import org.openqa.selenium.WebDriver;
import testingData.StandardData;
import testingData.TimeDelay;

public class IspitanikPage extends BasePageClass{

    public IspitanikPage(WebDriver driver) { super(driver); }

    public boolean verifyIspitanikPage(){
        return waitForUrlToChange(StandardData.INDEX_URL, TimeDelay.DELAY_3_SEC);
    }
}
