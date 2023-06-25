package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayBuyItNowLocators {
	//select color
	@FindBy(xpath="//select[@id='x-msku__select-box-1000']")
	public WebElement ddColor;
	
	//select size
	@FindBy(xpath="//select[@selectboxlabel='Size']")
	public WebElement ddSize;
	
	//select Quantity
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement txtbxQuantity;
	
	//select Buy It Now
	@FindBy(xpath=" //span[contains(text(),'Buy')]")
	public WebElement btnbuyItNow;
	
}
 