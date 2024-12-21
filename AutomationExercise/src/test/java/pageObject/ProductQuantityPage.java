package pageObject;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductQuantityPage extends Basepage
{
public ProductQuantityPage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")
public WebElement viewProductButton;

@FindBy(xpath="//input[@id='quantity']")
public WebElement quantityInput;

@FindBy(xpath = "//button[normalize-space()='Add to cart']")
public WebElement addToCartButton;


@FindBy(xpath = "//u[normalize-space()='View Cart']")
public WebElement viewCartButton;




//cart page
@FindBy(xpath = "//td[@class='cart_quantity']//button[@class='disabled']")//button[normalize-space()='4']
public WebElement cartQuantity;


/*public void clickViewProduct() 
{
	
    viewProductButton.click();
}*/
public void clickViewProductButton() {
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(viewProductButton));
        element.click();
    } catch (ElementClickInterceptedException e) {
        System.out.println("Element click intercepted. Using JavaScript click.");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", viewProductButton);
        js.executeScript("arguments[0].click();", viewProductButton);
    }
}

public void setQuantity(String quantity) {
    quantityInput.clear();
    quantityInput.sendKeys(quantity);
}

public void clickAddToCart() {
    addToCartButton.click();
}

public void clickViewCart() {
    viewCartButton.click();
}

public String getCartQuantity() throws InterruptedException
{
	Thread.sleep(2000);
    return cartQuantity.getText();
}




}
