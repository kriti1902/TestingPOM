/* We have all our test cases in this page.
 * We have written four test cases and BeforeClass and AfterClass
 * @BeforeClass- to start the browser and enter the url
 * 1. loginUser-To work on login page
 * 2. accounts-It will have functionality for account option
 * 3. reports-It will have functionality for reports option
 * 4. Settings-It will have functionality for settings option
 * @AfterClass- to close the browser*/

package xeroPOM;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import xeroPOM.LoginPage;
import xeroPOM.AccountPage;
import xeroPOM.ReportPage;
import xeroPOM.SettingsPage;

public class TestAutomation {

	WebDriver driver;
	
	
	@BeforeClass
	public void setup(){

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://login.xero.com/");
        

    }
	@Test
	public void loginUser(){
		LoginPage.Username(driver).sendKeys("abc@xyz.com");
		LoginPage.password(driver).sendKeys("12345");
		LoginPage.Login(driver).click();
	}
	 
	@Test
	public void accounts(){
		AccountPage.accountTab(driver).click();
		AccountPage.AllBankAccount(driver).click();
		AccountPage.newBankaccount(driver).click();
		AccountPage.SearchBank(driver).sendKeys("citi");
		AccountPage.selectBank(driver).click();
		AccountPage.AccountContinue(driver).sendKeys("Business Account");
		AccountPage.accountNum(driver).sendKeys("12345678");
		AccountPage.AccountContinue(driver).click();
	}
	
	@Test
	public void reports(){
		ReportPage.reportTab(driver).click();
		ReportPage.allReports(driver).click();
		ReportPage.balSheetReport(driver).click();
	}
	
	@Test
	public void settings(){
		SettingsPage.settingsTab(driver).click();
		SettingsPage.GenSettings(driver).click();
		SettingsPage.orgSettings(driver).click();
	}
	
	@AfterClass
	public void close(){
		driver.quit();
	}
}
