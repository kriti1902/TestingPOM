/*We have all the web elements we need for our login page
 * Username- to enter the email id
 * password- to enter the password
 * Login- to click on Login Button
 * */


package xeroPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static WebElement element=null;
	public static WebElement Username(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='email']"));
		return element;
	}
	public static WebElement password(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='password']"));
		return element;
		
	}
	public static WebElement Login(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='submitButton']"));
		return element;
	}
}
