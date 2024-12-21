package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchproductpage extends Basepage
{
public  Searchproductpage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//input[@id='search_product']") 
WebElement searchProduct;

@FindBy(xpath="//button[@id='submit_search']")  
WebElement submitSearch;

@FindBy(xpath="//h2[normalize-space()='Searched Products']") 
WebElement searchedProducts;

@FindBy(xpath="//div[@class='product-image-wrapper']")
WebElement verifyallproducts;

public void searchproduct(String user)
{
	searchProduct.sendKeys(user);
}

public void clicksearch()
{
	submitSearch.click();
}

public boolean searchproductsvisible()
{
	return searchedProducts.isDisplayed();
}
public boolean verifyproductsvisible()
{
	return verifyallproducts.isDisplayed();
}

}
