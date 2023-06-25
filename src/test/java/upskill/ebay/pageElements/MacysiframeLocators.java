package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MacysiframeLocators {
	
	

//Click iframe Shop Now		
@FindBy(xpath=" //img[contains(@src,'1113033')]")	
public WebElement adImage33;


//Verify DKNY Page
@FindBy(xpath="//img[@alt='DKNY']")	
public WebElement verifyDKNYPage;


	}
