package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RahulHandleAlertLocators {
	
	
//Enter your Name	
@FindBy (xpath="//input[@id='name']")
 public WebElement txtbxName;

//Click Alert Button	
 @FindBy (xpath="//input[@id='alertbtn']")
public WebElement btnAlert;

//Click Confirm Button
@FindBy (xpath="//input[@id='confirmbtn']")
public WebElement btnConfirm;


}
