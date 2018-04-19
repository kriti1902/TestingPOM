/*We have all our web elements for report functionality in this class file
 * reportTab- to click on the Reports tab
 * allReports- to click on all Reports option
 * balSheetReport- to click on the Balance Sheet link
 * */

package xeroPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportPage {

private static WebElement element=null;
	
	public static WebElement reportTab(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='Reports']"));
		return element;
	}
	public static WebElement allReports(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='xero-nav']/div[2]/div[2]/div[1]/ul/li[4]/ul/li[1]/a"));
		return element;
	}
	public static WebElement balSheetReport(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='report-centre-parent']/div/div[1]/div/div[1]/div[1]/div/div[1]/div[1]"));
		return element;
	}
	
}
