/*We have all our web elements for report functionality in this class file
 * settingsTab- to click on the Setting tab
 * GenSettings- To Select general settings option
 * orgSettings- To click on Organization settings
 */
package xeroPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPage {
	private static WebElement element=null;
	public static WebElement settingsTab(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='Settings']"));
		return element;	
	}
	public static WebElement GenSettings(WebDriver driver){
		element=driver.findElement(By.linkText("General Settings"));
		return element;
	}
	public static WebElement orgSettings(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='view-favs']/div/div[1]/section[1]/div[1]/div/a[2]"));
		return element;
	}
}
