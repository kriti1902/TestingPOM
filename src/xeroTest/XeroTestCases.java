package xeroTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XeroTestCases extends ReusableMethods {
	private static WebDriver driver;
	
		@BeforeTest
		@Parameters("browser")
		public void setUp(String browser) throws InterruptedException{
			if(browser.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.firefox.marionette", "E:/Automation Training docs/geckodriver.exe");
				driver= new FirefoxDriver();
				driver.manage().window().maximize();
			}
			else if(browser.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver", "E:/Automation Training docs/chromedriver.exe");
				driver=new ChromeDriver();
			}
			}
		@Test	
		public void Login() throws InterruptedException{
		driver.get("https://login.xero.com/");
		
		WebElement emailObj=driver.findElement(By.xpath("//*[@id='email']"));
		enterText(emailObj, "abc@gmail.com", "Email");
		
		
		WebElement passwordObj=driver.findElement(By.xpath("//*[@id='password']"));
		enterText(passwordObj, "1234", "Password");
		
		Thread.sleep(3000);
		WebElement loginObj=driver.findElement(By.xpath("//*[@id='submitButton']"));
		clickButton(loginObj, "Login");
		}
		
		@Test
		public static void Accounts(){
		WebElement accountObj=driver.findElement(By.linkText("Accounts"));
		clickLink(accountObj, "Accounts");
		
		WebElement BAccountObj=driver.findElement(By.xpath("//*[@id='xero-nav']/div[2]/div[2]/div[1]/ul/li[2]/ul/li[1]/a"));
		clickLink(BAccountObj, "Bank Account");
		
		WebElement AddAccObj=driver.findElement(By.xpath("//*[@id='ext-gen16']"));
		clickButton(AddAccObj, "Add Account");
		
		driver.findElement(By.xpath("//*[@id='dataview-1021']/li[1]")).click();
		}
		
		@Test
		public static void Reports(){
			WebElement reportObj=driver.findElement(By.xpath("//*[@id='Reports']"));
			clickLink(reportObj, "Reports");

			WebElement allReportObj=driver.findElement(By.xpath("//*[@id='xero-nav']/div[2]/div[2]/div[1]/ul/li[4]/ul/li[1]/a"));
			clickLink(allReportObj, "All Reports");
			driver.findElement(By.xpath("//*[@id='report-centre-parent']/div/div[1]/div/div[1]/div[1]/div/div[1]/div[1]")).click();
			
		}
		public void settings(){
			WebElement SettingsObj=driver.findElement(By.xpath("//*[@id='Settings']"));
			clickLink(SettingsObj, "Settings");
			
			WebElement genSettingObj=driver.findElement(By.linkText("General Settings"));
			clickLink(genSettingObj, "General Settings");
			driver.findElement(By.xpath("//*[@id='view-favs']/div/div[1]/section[1]/div[1]/div/a[2]")).click();
			
		}
}
