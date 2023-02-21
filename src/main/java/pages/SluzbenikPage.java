package pages;

import org.openqa.selenium.WebDriver;
import testingData.StandardData;
import testingData.TimeDelay;

public class SluzbenikPage extends BasePageClass{

    public SluzbenikPage (WebDriver driver) {super(driver);}

    public boolean verifySluzbenikPage(){
        return waitForUrlToChange(StandardData.INDEX_URL, TimeDelay.DELAY_3_SEC);
    }


}
