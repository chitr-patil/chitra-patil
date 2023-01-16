package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.UtilityMethod;

public class CartPage extends TestBase {
	//Object Repository
	/*@FindBy(xpath="//span[text()='Your Cart']") private WebElement yourCartLable;
    @FindBy(id="remove-sauce-labs-backpack") private WebElement backpack;
    @FindBy(xpath="//div[text()='Sauce Labs Bike Light']") private WebElement backLight;
    */
	@FindBy(xpath="//button[@id=\"remove-sauce-labs-fleece-jacket\"]") private WebElement fleeceJacket; 
     @FindBy(xpath="//button[@id=\"checkout\"]") private WebElement checkout;
     @FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement productCount;
     
    public CartPage()             // constructor
    {
    	PageFactory.initElements(driver, this);
    }
    public WebElement verifyProductCount()
    {
    	fleeceJacket.click();
    	return fleeceJacket;
    }
    public String verifyCartPageUrl()
    {
    	checkout.click();
    	return driver.getCurrentUrl();
    }
    
}
