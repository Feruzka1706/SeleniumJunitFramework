package tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tryCloud.utility.Driver;

import java.util.List;

public class SauceDemoPage {

    public SauceDemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(className = "inventory_item_price")
    public WebElement firstItemPrice;

    @FindBy(className = "inventory_item_name")
    public WebElement firstItemName;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> allItems;

    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingCart;

    @FindBy(id = "continue-shopping")
    public WebElement continueShopping;

    @FindBy(id = "react-burger-menu-btn")
    public WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    public WebElement logOutBtn;




}
