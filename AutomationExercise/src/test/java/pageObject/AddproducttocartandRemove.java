package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddproducttocartandRemove extends Basepage
{
public AddproducttocartandRemove(WebDriver driver)
{
	super(driver);
}



@FindBy(xpath = "//div[@class='productinfo text-center']//a[@data-product-id='1']")
WebElement addToCartFirstProduct;



@FindBy(xpath = "//div[@class='productinfo text-center']//a[@data-product-id='2']")
WebElement addToCartSecondProduct;

@FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
WebElement continueShoppingButton;

@FindBy(xpath = "//u[normalize-space()='View Cart']")
WebElement viewCartButton;

@FindBy(xpath = "//iframe[contains(@id,'aswift')]")
WebElement adIframe;

//remove product from cart
@FindBy(xpath = "//i[@class='fa fa-times']")
public WebElement removeProductButton;

@FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
public WebElement emptyCartMessage;

private void hideIframe() {
    try {
        // Check if the iframe exists and is displayed
        if (adIframe.isDisplayed()) {
            // Use JavaScript to hide the iframe
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.display='none';", adIframe);
        }
    } catch (Exception e) {
        System.out.println("No iframe found or already hidden.");
    }
}



public void addFirstProductToCart() {
    try {
        // Remove or hide the iframe blocking the element
        hideIframe();

        // Use JavaScript Executor to click the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", addToCartFirstProduct);
    } catch (Exception e) {
        System.out.println("Error while adding the first product to the cart: " + e.getMessage());
    }
}



public void addSecondProductToCart() {
    try {
        // Remove or hide the iframe blocking the element
        hideIframe();

        // Use JavaScript Executor to click the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", addToCartSecondProduct);
    } catch (Exception e) {
        System.out.println("Error while adding the second product to the cart: " + e.getMessage());
    }
}


public void clickContinueShopping() {
    continueShoppingButton.click();
}

public void clickViewCart() {
    viewCartButton.click();
}

//remove product from cart
public void removeProductFromCart() {
    removeProductButton.click();
}

public boolean isCartEmpty() throws InterruptedException 
{
	Thread.sleep(2000);
    return emptyCartMessage.isDisplayed();
}



}
