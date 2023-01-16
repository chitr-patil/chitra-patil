package TestCases;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase {
	LoginPage login;
	InventoryPage invent;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		login.loginToApp();
	}
	@Test (enabled = false)
	public void verifyPeekLogoTest()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled=true)
	public void addProductTest() throws Exception
	{
		String result = invent.addProduct();
		Assert.assertEquals(result, "3");
		Reporter.log("Total product added = " + result);
	}
	@Test(enabled=false)
	public void verifyTitleTest()
	{
		String expStr = "Swag Labs";
		String actStr = invent.verifyTitle();
		Assert.assertEquals(actStr, expStr);
	}
	@Test(enabled=false)
	public void verifyUrlTest()
	{
		String expStr = "https://www.saucedemo.com/inventory.html";
		String actStr = invent.verifyUrl();
		Assert.assertEquals(actStr, expStr);
	}
	@Test(enabled=false)
	public void verifyProductLableTest()
	{
		String expStr = "PRODUCTS";
		String actStr = invent.verifyProductLable();
		Assert.assertEquals(actStr, expStr);
	}
	@Test(enabled=false)
	public void verifySwagLabsLogoTest() throws Exception
	{
		String actStr = invent.verifySwagLabsLogo();
		//Assert.assertEquals(actStr, expected);
	}
	@Test(enabled=false)
	public void verifyReactBurgerMenuButtonTest() throws Exception
	{
		invent.verifyReactBurgerMenuButton();
	}
	@Test(enabled=false)
	public void verifySwagBotTest() throws Exception
	{
		boolean actStr = invent.verifySwagBot();
		Assert.assertEquals(actStr, true);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}