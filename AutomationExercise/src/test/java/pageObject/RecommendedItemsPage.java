package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecommendedItemsPage extends Basepage
{
public RecommendedItemsPage(WebDriver driver)
{
	super(driver);
}


@FindBy(xpath = "//h2[normalize-space()='recommended items']")
WebElement recommendedItemsHeader;

@FindBy(xpath = "//div[@class='item active']//div[1]//div[1]//div[1]//div[1]//a[1]")
public WebElement addToCartButton;

@FindBy(xpath = "//u[normalize-space()='View Cart']")
public WebElement viewCartButton;

@FindBy(xpath = "//table[@id='cart_info_table']")
public WebElement cartTable;

public boolean isRecommendedItemsHeaderVisible() {
    return recommendedItemsHeader.isDisplayed();
}

public void clickAddToCart() {
    addToCartButton.click();
}

public void clickViewCart() {
    viewCartButton.click();
}

public boolean isProductDisplayedInCart() {
    return cartTable.isDisplayed();
}
}
