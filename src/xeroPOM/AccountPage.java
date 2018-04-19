/*We have all our web elements for account functionality in this class file
 * accountTab- to click on account tab
 * AllBankAccount- to click on All Bank Accounts option
 * newBankaccount- to click on add new account button
 * SearchBank- to put value to search for your bank
 * selectBank- to select your bank from the option
 * accountName- to enter the account name
 * accountNum- to enter the account num
 * AccountContinue- to click on continue button
 * */

package xeroPOM;

import java.lang.annotation.Retention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	private static WebElement element=null;
	
	public static WebElement accountTab(WebDriver driver){
		element=driver.findElement(By.linkText("Accounts"));
		return element;
	}
	public static WebElement AllBankAccount(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='xero-nav']/div[2]/div[2]/div[1]/ul/li[2]/ul/li[1]/a"));
		return element;
	}
	public static WebElement newBankaccount(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='ext-gen16']"));
		return element;
	}
	public static WebElement SearchBank(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='xui-searchfield-1018-inputEl']"));
		return element;
	}
	public static WebElement selectBank(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='dataview-1025']/li[1]"));
		return element;
		
	}
	public static WebElement accountName(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='accountname-1036-inputEl']"));
		return element;
		
	}
	public static WebElement accountNum(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='accountnumber-1067-inputEl']"));
		return element;
	}
	public static WebElement AccountContinue(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='common-button-submit-1015']"));
		return element;
	}
}
