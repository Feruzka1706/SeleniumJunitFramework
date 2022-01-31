package tryCloud.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import tryCloud.pages.HamburgerPage;
import tryCloud.utility.BrowserUtils;
import tryCloud.utility.ConfigReader;
import tryCloud.utility.Driver;
import tryCloud.utility.TestBase;
/**
 * Exercise1:
 * Develop automation script by using Java& selenium libraries for following test
 * case:
 * Our partners logo, name and description validation:
 * Test Steps:
 * open
 * https://www.achieve3000.com
 * click hamburger menu( left corner) in top right corner
 * open Our Partners from the list
 * List all partners logo
 * check all presented partners has logo, header and text description
 */


public class Test01 extends TestBase {
    HamburgerPage homePage = new HamburgerPage();

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.read("url"));
        BrowserUtils.waitFor(3);
        homePage.hamburgerMenu.click();

        BrowserUtils.waitFor(3);
        homePage.partnersMenuBar.click();
        BrowserUtils.waitFor(3);

        SoftAssert softAssert = new SoftAssert();
       for(WebElement eachLogo : homePage.partnersLogoPics){
           softAssert.assertTrue(!(eachLogo.getAttribute("alt").isEmpty() ));
       }

       BrowserUtils.waitFor(2);

       for(WebElement eachPartnerHeader : homePage.allPartnersHeader){
           softAssert.assertFalse(eachPartnerHeader.getText().isEmpty());
       }

        for (int i = 0; i <homePage.allPartnersText.size()-1; i++) {

            softAssert.assertTrue(!homePage.allPartnersText.get(i).getText().isEmpty());
        }

        softAssert.assertAll();


    }

}
