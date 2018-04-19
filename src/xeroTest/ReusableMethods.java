package xeroTest;

import org.openqa.selenium.WebElement;

public class ReusableMethods {
	
	public static void enterText(WebElement webObj, String textVal,String objName){
  		if(webObj.isDisplayed()){
  			webObj.sendKeys("abc@gmail.com");
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
	public static void clickLink(WebElement webObj,String objName) {
		if(webObj.isDisplayed()){
			webObj.click();
			System.out.println("Pass: "+objName+ "is clicked");
			
		}else
		{
			System.out.println("Fail: "+objName+ " not found");
		}
	}
}
