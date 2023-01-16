package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase{          // testbase class import jhala cz to dusrya packet mde ahe
	
	LoginPage login;//=new LoginPage();
	
	@BeforeMethod                  // he apli prirequisit                                   // control+spacebar......ata @test madlya method @beforMethod made ghetlya.
    public void setup() throws Exception                              // @Test made aapan fct test cha part lihto , initialization lihalay te chukich ahe.te fct bgaych hot ki setup brobr ahe ka nhi te pahil.
    {
		initialization(); 
		login=new LoginPage();                   // connection banvlyavr he method show jhali,..prog run krun bgitla, run jhala,tyat java chya aivji testng yetay cz aapn eth testng plugin add kaly.eth aapn main method ghet nhi cz framework mde main method chi garaj nahi.without main method prog run hoto.
    } 
	@Test //(priority=1)
	public void verifyTitleTest() throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle);
	}
	@Test//(priority=3)
	public void verifyCurrentUrlTest() throws Exception
	{
		//System.out.println(driver.getCurrentUrl());
		String expUrl = "https://www.saucedemo.com/";
		String actUrl = login.verifyCurrentUrl();
		Assert.assertEquals(actUrl, expUrl);
	}
	@Test//(dependsOnMethods="verifyCurrentUrlTest")                                // Use dependsOnMethod here-jr mi purposely ya method la fail kel tr ji method depend ahe ti skip hoil ani other program will be run not stopped.
	public void verifyLableOfInventoryTest() throws Exception            // ya method la mla priority deta yeina cz mi already tithe depends on kelela ahe. but he method jya method vr depend ahe tya method nanty he method automatically run hote eg:-jr Url ya method che priority 2 ahe ani depends aslelya method la mla priority deta yet nahiys so mi next method la dili next priority but maji hich method jya method vr depend ahe tyanantr run hoil dusrya method la priority asun pn tichya agodar he run hoil.
	{
		String expStr = "PRODUCTS";
		String actStr = login.verifyLableOfInventory();
		Assert.assertEquals(actStr, expStr);
	}
	@Test//(priority=3)                                                             // Use priority
	public void loginToAppTest() throws Exception
	{ 
		String expStr = "https://www.saucedemo.com/inventory.html";
		String actStr = login.loginToApp();
		Assert.assertEquals(actStr, expStr);
	}
	@AfterMethod
	public void closeBrowser()               // open keleli apl close kraychiy so ..
	{
		                    // ethe driver.close option yet nahi cz instance dusrya class mde ahe. apan ekch instance use krnar ani to pratyek velela vaprnar.ata yasathi aplyala TestBase class mdla webdriver globaly declare krava lagel.mg to aplyala ethe show krell.
		driver.close();                   // ata pn yet nhiye method driver.close...change the visiblity of driver as protected. so mi public krnr...ata driver.close method show krte.
		                                  // pubic kel so te kuthepn use krta yet.ani static pn krav lagel cz apn tyachi single copy sglikade use krto.ani static is access to all.
	}
	
	
	// je pn prerequisite ahe te aapn setup mde gheto.eg.-aapn browser open krto.ani postrequisite mde apn browser close krto. tr prerequisite mde aapn fct browser opench nahi krt
	// tr obj initialize pn kraych ast.before method run every time whenever test case need to be run.mhanjech prog run krnyasathi jepn lagt te aapn setup mde thevto.
}                                                  
