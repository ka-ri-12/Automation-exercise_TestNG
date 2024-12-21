package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyProductdetails extends Basepage
{
public VerifyProductdetails(WebDriver driver)
{
	super(driver);
}
//div[@class='features_items']
@FindBy(xpath="//h2[normalize-space()='All Products']") 
WebElement Products;

@FindBy(xpath="//div[@class='features_items']") 
WebElement allProducts;

@FindBy(xpath="//div[@class='features_items']") 
WebElement btnProducts;

@FindBy(xpath="//span[normalize-space()='Rs. 500']") 
WebElement price;

@FindBy(xpath="//button[normalize-space()='Add to cart']") 
WebElement addToCart;

public boolean allproductsdisplayed()
{
	return Products.isDisplayed();
}

public boolean allproductslist()
{
	return allProducts.isDisplayed();
}

public boolean clickproduct()
{
	return btnProducts.isDisplayed();
}

public boolean verifyprice()
{
	return price.isDisplayed();
}

public boolean verifyaddtocart()
{
	return addToCart.isDisplayed();
}


}
