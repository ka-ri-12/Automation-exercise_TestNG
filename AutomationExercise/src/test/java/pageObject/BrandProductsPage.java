package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrandProductsPage extends Basepage
{
public BrandProductsPage(WebDriver driver)
{
	super(driver);
}


@FindBy(xpath = "//h2[normalize-space()='Brands']")
 WebElement brandsSidebar;

@FindBy(xpath = "//a[@href='/brand_products/H&M']")
 WebElement brandLink;

@FindBy(xpath = "//h2[normalize-space()='Brand - H&M Products']")
WebElement brandProductsHeader;

@FindBy(xpath = "//a[@href='/brand_products/Biba']")
 WebElement anotherBrandLink;

@FindBy(xpath = "//h2[normalize-space()='Brand - Biba Products']")
WebElement anotherBrandheader;

public boolean isBrandsVisible() {
    return brandsSidebar.isDisplayed();
}

/*public void clickOnBrandLink() {
    brandLink.click();
}*/

public void clickOnBrandLink() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(brandLink));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickableElement);
    clickableElement.click();
}

public boolean isBrandProductsDisplayed() {
    return brandProductsHeader.isDisplayed();
}

/*public void clickOnAnotherBrandLink() {
    anotherBrandLink.click();
}*/
public void clickOnAnotherBrandLink() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable( anotherBrandLink));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickableElement);
    clickableElement.click();
}


public boolean isAnotherBrandProductDisplayed()
{
	return anotherBrandheader.isDisplayed();
}














}
