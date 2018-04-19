

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Driver extends TestCases {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		//TestCases.Login_Error_Message();
		
		String testDataPath="E:/Automation Training docs/TestSuit1.xls";
		
		String[][] recData=ReusableMethodExcel.readSheet(testDataPath, "Sheet1");
		for(int i=1;i<recData.length;i++){
			
			if(recData[i][1].equalsIgnoreCase("Y")){
				if(recData[i][3].equalsIgnoreCase("Y")){
					System.setProperty("webdriver.chrome.driver", "E:/Automation Training docs/chromedriver.exe");
					driver=new ChromeDriver();
					
					String tc=recData[i][2];
					Method testCase= TestCases.class.getMethod(tc);
					testCase.invoke(testCase);
				}
				if(recData[i][4].equalsIgnoreCase("Y")){
					//System.setProperty("webdriver.gecko.driver", "E:/Automation Training docs/geckodriver.exe");
					
					driver=new FirefoxDriver();
					driver.manage().window().maximize();  //maximize browser
					String tc=recData[i][2];
					Method testCase= TestCases.class.getMethod(tc);
					testCase.invoke(testCase);
				}
				if(recData[i][5].equalsIgnoreCase("Y")){
					System.setProperty("webdriver.ie.driver", "E:/Automation Training docs/IEDriverServer.exe");
					
					driver=new InternetExplorerDriver();
					driver.manage().window().maximize();  //maximize browser
					String tc=recData[i][2];
					Method testCase= TestCases.class.getMethod(tc);
					testCase.invoke(testCase);
				}
			
			}
		}
		
		
		//String tc="Login_Error_Message";
		
		//Method testCase= TestCases.class.getMethod("Login_Error_Message");
		
		
	}

}
