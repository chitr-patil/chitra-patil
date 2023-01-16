package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Base.TestBase;
import Utility.UtilityMethod;

public class InventoryPage extends TestBase {
	@FindBy(xpath = "//div[@class='peek']") private WebElement peekLogo;
	@FindBy(xpath = "//img[@alt='Swag Bot Footer']") private WebElement swagBot;
	//@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement bagpack;   
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backpack;
	//@FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement bikeLight;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikeLight;
	//@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement boltTshirt;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement boltTshirt;
	//@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket") private WebElement fleesJacket;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement fleeceJacket;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement sortProductDropdown;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement productCount;
	@FindBy(xpath="//span[text()='Products']") private WebElement productLable;
	@FindBy(xpath="//button[text()='Open Menu']") private WebElement reactBurgerMenuButton;
	@FindBy(xpath="//div[@class='app_logo']") private WebElement swagLabsLogo;
	@FindBy(xpath="//a[text()='Twitter']") private WebElement twitterLink;
	@FindBy(xpath="//a[text()='Facebook']") private WebElement facebookLink ;
	@FindBy(xpath="//a[text()='LinkedIn']") private WebElement linkedInLink;
	@FindBy(xpath="//div[@class='inventory_item_name']") private WebElement inventoryItemsName;
	
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyPeekLogo()
	{
		return peekLogo.isDisplayed();
	}
	public boolean verifySwagBotLogo()
	{
		return swagBot.isDisplayed();
	}
	public String addProduct() throws Exception
	{
		UtilityMethod.selectClass(sortProductDropdown, "Name (Z to A)");
		Thread.sleep(3000);
		backpack.click();
		bikeLight.click();
		fleeceJacket.click();
		Thread.sleep(3000);
		productCount.click();
		return productCount.getText();
	}
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
	public String verifyProductLable()
	{
		return productLable.getText();
	}
	public String verifySwagLabsLogo() throws Exception
	{
		Thread.sleep(1000);
		return swagLabsLogo.getText();
	}
	public WebElement verifyReactBurgerMenuButton() throws Exception
	{
		Thread.sleep(1000);
		 reactBurgerMenuButton.click();
		 return reactBurgerMenuButton;
	}
	public boolean verifySwagBot() throws Exception
	{
		Thread.sleep(1000);
		return swagBot.isDisplayed();
	}
	/*public void verifyinventoryItemsName()
	{
		
	}*/
	
	
}












