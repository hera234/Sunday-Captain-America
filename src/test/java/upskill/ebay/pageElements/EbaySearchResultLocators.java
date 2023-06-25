package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {

		//Validate Shoes Items
		@FindBy(xpath="//span[2][contains(text(), 'Shoes')]")
		public WebElement txtShoes;
		
		//Validate Shirts Items
		@FindBy(xpath="//span[2][contains(text(), 'Shirts')]")
		public WebElement txtShirts;
		
		//Validate Pants Items
		@FindBy(xpath="//span[2][contains(text(), 'Pants')]")
		public WebElement txtPants;
		
		//Checkbox Brand Adidas
		@FindBy(xpath="//input[@aria-label='adidas']")
		public WebElement cbxBrandAdidas;

		//Checkbox Brand Nike
		@FindBy(xpath="//input[@aria-label='Nike']")
		public WebElement cbxBrandNike;

		//Checkbox Brand Unbranded
		@FindBy(xpath="//input[@aria-label='Unbranded']")
		public WebElement cbxBrandUnbranded;
		
		
		
		@FindBy(xpath="//span[text()='Sunglasses']")
		public WebElement txtSunglasses;
		
		@FindBy(xpath="//span[text()='Watches']")
		public WebElement txtWatches;
		
		@FindBy(xpath="//span[text()='Perfumes']")
		public WebElement txtPerfumes;
		
		@FindBy(xpath="//input[@aria-label='Gucci']")
		public WebElement cbxBrandGucci;
		
		@FindBy(xpath="//input[@aria-label='Rolex']")
		public WebElement cbxBrandRolex;
		
		@FindBy(xpath="//input[@aria-label='CHANEL']")
		public WebElement cbxBrandChanel;
		
		//Shirt link
	@FindBy(xpath="//span[contains(text(), 'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT')]")
	public WebElement linkShirtItems;
	
	

	@FindBy(xpath="(//span[@aria-level='3'])[2]")	
	public WebElement selectFirstShoes; 	
	
	}