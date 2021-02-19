package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testcases.BaseTest;

public class HomePage extends BaseTest{
	
	@FindBy(id="contentIframe") public WebElement frameid;
	@FindBy(xpath="//span[@id='spanDone']") public WebElement done;
	@FindBy(xpath="//*[@class='accountDetailsLangDropDown']") public WebElement language;
	@FindBy(xpath="//div[text()='English']") public WebElement english;
	@FindBy(xpath="//div[text()='हिंदी']") public WebElement hindi;
	@FindBy(xpath="//div[text()='Español']") public WebElement español;
	
	
	
	
	public void selectLanguage()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		List<WebElement> ls = driver.findElements(By.tagName("iframe"));
		System.out.println(ls.size());
		driver.switchTo().frame(0);
		wait.until(ExpectedConditions.visibilityOf(done));
		done.click();
		
		Select s=new Select(driver.findElement(By.xpath("//*[@class='accountDetailsLangDropDown']")));
		//language.click();
		s.selectByVisibleText("English");
		Boolean englishdisplayed = driver.findElement(By.xpath("//div[role'menu' or text()='English']")).isDisplayed();
		s.selectByVisibleText("हिंदी");
		Boolean hindidisplayed = driver.findElement(By.xpath("//div[role='menu' or text()='हिंदी']")).isDisplayed();
		s.selectByVisibleText("Español");
		Boolean españoldisplayed = driver.findElement(By.xpath("//div[role'menu' or text()='Español']")).isDisplayed();
		
	}

}
