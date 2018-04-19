import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NewTest {
public static WebDriver driver;
public static void main(String[] args) {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com/");
	
	driver.findElement(By.id("username")).sendKeys("kriti@mycompany.com");
	
	driver.findElement(By.id("password")).sendKeys("Kb123456");
	
	driver.findElement(By.id("Login")).click();
	
	
}
}
