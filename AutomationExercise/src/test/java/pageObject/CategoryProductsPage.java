package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryProductsPage extends Basepage
{
public CategoryProductsPage(WebDriver driver)
{
	super(driver);
}


@FindBy(xpath = "//div[@class='left-sidebar']//h2[text()='Category']")
WebElement categoriesHeading;

@FindBy(xpath = "//a[normalize-space()='Women']")
WebElement womenCategory;

@FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
WebElement womenDressSubcategory;

@FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
WebElement womenTopsHeader;

@FindBy(xpath = "//a[normalize-space()='Men']")
WebElement menCategory;

@FindBy(xpath = "//a[normalize-space()='Tshirts']")
WebElement menTshirtsSubcategory;

@FindBy(xpath = "//h2[normalize-space()='Men - Tshirts Products']")
WebElement menTshirtsHeader;


public boolean isCategoriesVisible() {
    return categoriesHeading.isDisplayed();
}

/*public void clickWomenCategory() {
    womenCategory.click();
}*/

public void clickWomenCategory() {
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(womenCategory)).click();
    } catch (Exception e) {
        // Fallback: JavaScript click in case of failure
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", womenCategory);
    }
}

/*public void clickWomenDressSubcategory() {
    womenDressSubcategory.click();
}*/

public void clickWomenDressSubcategory() {
    try {
        // Wait for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(womenDressSubcategory)).click();
    } catch (Exception e) {
        try {
            // Fallback: Use JavaScript click
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", womenDressSubcategory);
        } catch (Exception jsException) {
            // Log the error if JavaScript click fails
            System.out.println("Failed to click the element using JavaScript: " + jsException.getMessage());
        }
    }
}

public boolean isWomenCategoryPageDisplayed() {
    return womenTopsHeader.isDisplayed();
}

public void clickMenCategory() {
    menCategory.click();
}

public void clickMenTshirtsSubcategory() {
    menTshirtsSubcategory.click();
}

public boolean isMenCategoryPageDisplayed() {
    return menTshirtsHeader.isDisplayed();
}




















}
