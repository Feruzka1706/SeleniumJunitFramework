package tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tryCloud.utility.Driver;

import java.util.List;

public class HamburgerPage {


    public HamburgerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@class='navbar-toggler collapsed'])[1]")
    public WebElement hamburgerMenu;

     @FindBy(xpath = "//ul/li/a[.='Partners']")
     public WebElement partnersMenuBar;


    @FindBy(xpath = "//*[@id=\"fullpage\"]/div[2]/div[2]/div/div/div/p")
    public List<WebElement> allPartnersText;

    @FindBy(xpath = "//*[@id=\"fullpage\"]/div[2]/div[2]/div/div[2]/a/h3")
    public List<WebElement> allPartnersHeader;



    @FindBy(xpath = "//div/a/img[@class='post-list-img img-fluid']")
    public List<WebElement> partnersLogoPics;





}
