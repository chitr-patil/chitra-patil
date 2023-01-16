package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase{
	
	// Object Repository (Webpage vrche je pn element aapan find krto te)         
	                                                                                // This is encapsulation
	@FindBy(xpath="//div[@class='login_logo']") private WebElement loginLogo;  // @FindBy= is a annotation,private=cz is a data,Webelement=kontya type cha data ahe ha te mhje he,loginLogo=data ch naav.
	@FindBy(xpath="//div[@class='bot_column']") private WebElement botLogo;  // Adv=is jr aplyala next page cha element lagt asel current page vr tr aapn to gheu shkto, aplyala exception ynr nahi.but normal xpath mde apn fct current page chech element find kru shkto so this drowback is overcome by this way.
	@FindBy(xpath="//input[@id='user-name']") private WebElement usrnameTextbox;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath="//input[@id='login-button']") private WebElement loginTextbox;
	@FindBy(xpath="//span[@class='title']") private WebElement productLable;
	//driver.finElement(By.xpath("")); // we create the testbase class n exdend it to the loginPageTest and LoginPage class. i.e Inheritance.
	// junya xpath mde ani nvin xpath mde ky farak ahe tr to driver cha.nvin mde driver nhi tr apn tyala use kru shakt nahi.driver apli automation script handle krto so driver ghenyasathi aplyala constructor ghyava lagel.
	
	// Constructor
	public LoginPage()  // use is when obj of class is created by default data member will be called.aapn ya verchya xpath mde driver nhi use kru shakt.so we cannot use both the xpath.mg aapn tyala driver sobt initialize kru ani te bydefault jhal pahije mhnun apn te constructor mde gheu.cz aapn jr te method mde ghel tr method la aplyala call krav lagel driver la initialize kr mhanun.
	{
		PageFactory.initElements(driver, this); // PageFactory is a class ani tyamde initElements he method ahe member initialize krnyasathi.,driver=kunasoby initialize kraych ahe?so.., this=kunache member initialize kraychet? tr current class che so we use here this keyword.
		
	}
	public String verifyTitle() throws Exception
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}
	public String verifyCurrentUrl() throws Exception
	{
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}	
	public String verifyLableOfInventory() throws Exception
	{
		Thread.sleep(2000);
		loginToApp();
		return productLable.getText();
	}
	public String loginToApp() throws Exception
	{
		Thread.sleep(2000);
		usrnameTextbox.sendKeys("standard_user");
		passwordTextbox.sendKeys("secret_sauce");
		loginTextbox.click();
		return driver.getCurrentUrl();
	}


	

}
// aapn sgl logic login page mde lihaych ani tya logic la method through call loginPageTest mdun kraycha.
// jar element current page vr available nsel, to dusrya page vr asel ani aapn tyala current page vr shodhtoy tr aplya "staleElement Exception yeil."eg= mi google ch homepage open kelay ani mi gmail vr click klay code through so sdhya mi gmail chya main page vr ahe ani mi code break nhi klela ani tyaves code gmail link chya side chya link vr jau pahtoy tr mg tithe exception yeil ki "stale Element exception".
// jar code mde khitri missing asel but tyaveli prog error nsel show krt but jva run hoto program teva exception yeil ki "Null pointer Exception". eg=LoginPageTest vr mi LoginPage cha ardhach obj create kla "LoginPage login;" asa ani mi to element access kru pahte tr mala null pointer exception yeil. cz mi to ardhach declare kelay tithe. mla "LoginPage login=neaw LoginPage" as lihav lagel.
