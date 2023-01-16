package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CartPageTest extends TestBase {
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login=new LoginPage();
		invent=new InventoryPage();
		login.loginToApp();
		cart=new CartPage();
		invent.addProduct();
	}
		
		@Test
		public void verifyProductCountTest()
		{
			WebElement actStr = cart.verifyProductCount();
			Assert.assertEquals(actStr, "2");
			Reporter.log("Total product added = " + actStr);
		}
		@Test
		public void verifyCartPageUrlTest()
		{
			 String actStr = cart.verifyCartPageUrl();
			String expStr = "https://www.saucedemo.com/checkout-step-one.html";
			Assert.assertEquals(actStr, expStr);
		}
		@AfterMethod
		public void closeBrowser()
		{
			driver.close();
		}
			
		
		
	}
