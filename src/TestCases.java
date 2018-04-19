



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCases extends ReusableMethod {
	private static WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//TestCases checkTest=new TestCases();
		//checkTest.Login_Error_Message();
		//checkTest.Login_To_Salesforce();
		//checkTest.forgot_password();
//		checkTest.user_logout();
		//checkTest.Wrong_usernamePwd();
	}
	 public static void Login_To_Salesforce() {
			
		  //System.setProperty("webdriver.chrome.driver", "E:/Automation Training docs/chromedriver.exe");
			//driver=new ChromeDriver();
			
		   // driver=new FirefoxDriver();  //launch browser
		  //	driver.manage().window().maximize();  //maximize browser
		  	
		  	
		  	/* Launch URL*/
		  	Driver.driver.get("https://www.salesforce.com");
		  	System.out.println("Salesforce app is launched");
		  	
		  	/*Login Object*/
		  	WebElement loginObj= Driver.driver.findElement(By.xpath("//a/span[2]"));
		  	
		  	/* Click operation*/
		  	loginObj.click();
		  	
		  	
		  	/* Enter user name*/
		  	WebElement usernameObj=Driver.driver.findElement(By.id("username"));
		  	enterText(usernameObj, "abc@gmail.com", "UserName");
		  	
		  	/* Enter password*/
		  	WebElement passwordObj=Driver.driver.findElement(By.id("password"));
		  	enterText(passwordObj, "", "Password");
		  		
	/* login button click*/
	WebElement loginButtonObj=Driver.driver.findElement(By.id("Login"));
	loginButtonObj.click();
	System.out.println("Login button is clicked");

	


	}
	  
	  public void Wrong_usernamePwd() {
		 // driver=new FirefoxDriver();  //launch browser
		  /*System.setProperty("webdriver.chrome.driver", "E:/Automation Training docs/chromedriver.exe");
			driver=new ChromeDriver();
				
		  driver.manage().window().maximize();  //maximize browser
*/		  	String actualMsg= new String("Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		  	
		  	/* Launch URL*/
		  	driver.get("https://www.salesforce.com");
		  	System.out.println("Salesforce app is launched");
		  	
		  	/*Login Object*/
		  	WebElement loginObj= driver.findElement(By.xpath("//a/span[2]"));
		  	
		  	/* Click operation*/
		  	loginObj.click();
		  	
		  	/* Enter user name*/
		  	WebElement usernameObj=driver.findElement(By.id("username"));
		  	
		  	usernameObj.sendKeys("kb@mycompany.com");
		  	System.out.println("User name is entered");

		  //	usernameObj.sendKeys("123");
		  	/* Enter password*/
	WebElement passwordObj=driver.findElement(By.id("password"));
		  	
	passwordObj.sendKeys("Kb@19");
	System.out.println("password is entered");
	//passwordObj.sendKeys("22131");
	
	/* login button click*/
	WebElement loginButtonObj=driver.findElement(By.id("Login"));
	loginButtonObj.click();
	System.out.println("Login button is clicked");

String errorMsg= driver.findElement(By.xpath("//div[@id='error']")).getText();
	
	System.out.println("error message is"+errorMsg);
	if(errorMsg.equals(actualMsg)){
		System.out.println("Pass: actual message "+actualMsg+" is same as the errormsg "+errorMsg);
	}
	else{
		System.out.println("Fail: actual message "+actualMsg+" is not same as the errormsg "+errorMsg);
		
	}
	


	}
	  public static void Login_Error_Message() throws Exception{
		
		  //driver=new FirefoxDriver();  //launch browser
		  
				

		  	
		  	String actualMsg=new String("Please enter your password.");
		  	//driver.close();  //close browser
		  	
		  	// Launch URL
		  	Driver.driver.get("https://www.salesforce.com");
		  	System.out.println("Salesforce app is launched");
		  	
		  	//Login Object
		  	WebElement loginObj= Driver.driver.findElement(By.xpath("//a/span[2]"));
		  	
		  	 //Click operation
		  	loginObj.click();
		  	
		  	// Enter user name
		  	WebElement usernameObj=Driver.driver.findElement(By.id("username"));
		  	
		  	usernameObj.sendKeys("abc");
		  	System.out.println("User name is entered");

		  //	usernameObj.sendKeys("123");
		  	 //Enter password
	WebElement passwordObj=Driver.driver.findElement(By.id("password"));
		  	
	passwordObj.sendKeys("");
	System.out.println("password is entered");
	//passwordObj.sendKeys("22131");
	
	// login button click
	WebElement loginButtonObj=Driver.driver.findElement(By.id("Login"));
	loginButtonObj.click();
	System.out.println("Login button is clicked");
	
	String errorMsg= Driver.driver.findElement(By.xpath("//div[@id='error']")).getText();
	
	System.out.println("error message is"+errorMsg);
	if(errorMsg.equals(actualMsg)){
		System.out.println("Pass: actual message "+actualMsg+" is same as the errormsg "+errorMsg);
	}
	else{
		System.out.println("Fail: actual message "+actualMsg+" is not same as the errormsg "+errorMsg);
		
	}
		
	}

	  
	  public void forgot_password() throws Exception {
		  	
		  	//driver=new FirefoxDriver();  //launch browser
		  /*System.setProperty("webdriver.chrome.driver", "E:/Automation Training docs/chromedriver.exe");
			driver=new ChromeDriver();
				
		  
		  driver.manage().window().maximize();  //maximize browser
*/		  	
		  	//String actualMsg=new String("Please enter your password.");
		  	//driver.close();  //close browser
		  	
		  	// Launch URL
		  	Driver.driver.get("https://www.salesforce.com");
		  	System.out.println("Salesforce app is launched");
		  	
		  	//Login Object
		  	WebElement loginObj= driver.findElement(By.xpath("//a/span[2]"));
		  	
		  	 //Click operation
		  	loginObj.click();
		  	
		  	// Enter user name
		  	WebElement usernameObj=driver.findElement(By.id("username"));
		  	
		  	usernameObj.sendKeys("abc");
		  	System.out.println("User name is entered");

		  
		  	WebElement passwordObj=driver.findElement(By.id("password"));
		  	
		  	passwordObj.sendKeys("");
		  	System.out.println("password is entered");
	
		  	driver.findElement(By.id("forgot_password_link")).click();
	
		  	driver.findElement(By.id("un")).sendKeys("kriti@mycompany.com");
		  	driver.findElement(By.id("continue")).click();
	

		  	
		  	
		  	
	  }
	  
	  public void user_logout() throws Exception{
		  	
		  	//driver=new FirefoxDriver();  //launch browser
		  /*System.setProperty("webdriver.chrome.driver", "E:/Automation Training docs/chromedriver.exe");
			driver=new ChromeDriver();
				
		  
		  driver.manage().window().maximize();  //maximize browser
*/		  	//driver.close();  //close browser
		  	
		  	/* Launch URL*/
		  	Driver.driver.get("https://www.salesforce.com");
		  	
		  	/*Login Object*/
		  	WebElement loginObj= driver.findElement(By.xpath("//a/span[2]"));
		  	
		  	/* Click operation*/
		  	loginObj.click();
		  	
		  	/* Enter user name*/
		  	WebElement usernameObj=driver.findElement(By.id("username"));
		  	
		  	usernameObj.sendKeys("kriti@mycompany.com");

		  	/* Enter password*/
		  	WebElement passwordObj=driver.findElement(By.id("password"));
		  	passwordObj.sendKeys("Kb@19Niv");
		  	
		  	/* login button click*/
		  	WebElement loginButtonObj=driver.findElement(By.id("Login"));
		  	loginButtonObj.click();
	
		  	WebElement userObj= driver.findElement(By.id("userNavButton"));
		  	userObj.click();
   
		  	driver.findElement(By.linkText("Logout")).click();
	  }
	  

}
