package testObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchObjects {
	
	
	
	
	public void selectitemfromdropdown (WebDriver driver, String  elementlocator, int s)
	
	{
		WebElement adults = driver.findElement(By.name(elementlocator));
		
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo("
						+ adults.getLocation().x + ","
						+ adults.getLocation().y + ")");
		Select selectByValue = new Select(adults);
		//int s =Integer.parseInt(string);
		selectByValue.selectByIndex(s);
	}
	
public void selectitemfromdropdownvalue (WebDriver driver, String  elementlocator, String value)
	
	{
		WebElement adults = driver.findElement(By.id(elementlocator));
		
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo("
						+ adults.getLocation().x + ","
						+ adults.getLocation().y + ")");
		Select selectByValue = new Select(adults);
		selectByValue.selectByValue(value);
	}
	
public void selectairport (WebDriver driver,String element, String value) throws InterruptedException

{
	WebElement ele2 = driver.findElement(By.name(element));
	ele2.clear();
	ele2.sendKeys(value);
	Thread.sleep(2000);

	driver.findElement(By.name(element));
	Thread.sleep(2000);
  }

}
