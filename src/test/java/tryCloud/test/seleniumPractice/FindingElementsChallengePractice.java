package tryCloud.test.seleniumPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tryCloud.pages.SauceDemoPage;
import tryCloud.utility.Driver;

import java.util.concurrent.TimeUnit;

public class FindingElementsChallengePractice {


    @BeforeMethod
    public void setup2(){


        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void testPractice1() throws InterruptedException{

        SauceDemoPage sauceDemoPage= new SauceDemoPage();

        Driver.getDriver().get("https://saucedemo.com");
        String currentTitle= Driver.getDriver().getTitle();
        System.out.println(currentTitle);

        Actions actions = new Actions(Driver.getDriver());
        actions.click(sauceDemoPage.userName).pause(2000).sendKeys("standard_user").perform();

        Thread.sleep(2000);
        actions.click(sauceDemoPage.password).pause(2000).sendKeys("secret_sauce").perform();

        Thread.sleep(2000);
        sauceDemoPage.loginButton.click();

        System.out.println(sauceDemoPage.firstItemName.getText());
        System.out.println(sauceDemoPage.firstItemPrice.getText());

        System.out.println(sauceDemoPage.allItems.size());

        for (WebElement eachItem: sauceDemoPage.allItems){
            System.out.println(eachItem.getText());
        }

        Thread.sleep(2000);

        actions.moveToElement(sauceDemoPage.shoppingCart).click().perform();
        Thread.sleep(2000);
        actions.moveToElement(sauceDemoPage.continueShopping).click().perform();

        Thread.sleep(2000);

        actions.moveToElement(sauceDemoPage.menuButton).click().perform();

        Thread.sleep(2000);

        actions.moveToElement(sauceDemoPage.logOutBtn).click().perform();

        Thread.sleep(2000);


    }

    @AfterMethod
    public void tearDown(){
        Driver.closeBrowser();
    }

}
