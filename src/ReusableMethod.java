
import org.openqa.selenium.WebElement;


public class ReusableMethod {
	public static void enterText(WebElement webObj, String textVal,String objName){
  		if(webObj.isDisplayed()){
  			webObj.sendKeys("abc");
  			System.out.println("Pass: "+ textVal+" entered in "+objName+ " field");
  		}
  		else{
  			System.out.println("Fail: "+objName+" filed doest not exist");
  		}
  	}
	
	public static void clickButton(WebElement webObj, String objName) {
		if(webObj.isDisplayed()){
			webObj.click();
			System.out.println("Pass: "+objName+ "is clicked");
			
		}else
		{
			System.out.println("Fail: "+objName+ " not found");
		}
	}
	
	public static void selectCheckBox(WebElement webObj, String objName) {
		
		boolean check;
		
		check=webObj.isSelected();
		if(check==false){
			webObj.click();
			System.out.println("Pass: "+webObj+ "is checked");
			
		}
		else{
			System.out.println("Pass:"+webObj+"is already checked");
		}
		
	}
public static void deselectCheckBox(WebElement webObj, String objName) {
		
		boolean unCheck;
		
		unCheck=webObj.isSelected();
		if(unCheck==false){
			webObj.click();
			System.out.println("Pass: "+webObj+ "is unchecked");
			
		}
		else{
			System.out.println("Pass:"+webObj+"is already unchecked");
		}
		
	}
}
