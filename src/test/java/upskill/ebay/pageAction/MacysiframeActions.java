package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.MacysiframeLocators;
import upskill.utilities.SetupDrivers;

public class MacysiframeActions {
	
	MacysiframeLocators MacysiframeLocatorsObj;
	
	public MacysiframeActions() {
       MacysiframeLocatorsObj = new MacysiframeLocators();
		PageFactory.initElements(SetupDrivers.driver,MacysiframeLocatorsObj);
		
		}
	
public void	Openmacyshome() throws Exception{
	SetupDrivers.driver.get("https://www.macys.com/");
	Thread.sleep(3000);
}

public void	clickiframeShopNow(){
   List<WebElement> iframeObj = SetupDrivers.driver.findElements(By.xpath("//iframe[@aria-label='Advertisement'] "));
   
   for (int i=0; i<iframeObj.size(); i++)
	SetupDrivers.driver.switchTo().frame(i);
	  
	  try{
		 MacysiframeLocatorsObj.adImage33.click();
	  }catch (Exception e){
		  System.out.println("Element not found in this frame");
	  }
}
public void	verifynewpage() throws Exception{
	Thread.sleep(3000);
	MacysiframeLocatorsObj.verifyDKNYPage.isDisplayed();
	Thread.sleep(3000);
}


}
