package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Helper;

public class HomePage {
	@FindBy(xpath="")WebElement backToSchool;
	@FindBy(xpath="")WebElement Categories;
	@FindBy(xpath="")WebElement clickOnMen;
	
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void HoverOverOnbackToSchool() {
		Helper.mouseOver(driver, backToSchool);
	}
	public Categories clickOnCategories(){
		Helper.clickOnElement(Categories);
		return new Categories(driver);
	}
	public MenPage clickOnMen() {
		Helper.clickOnElement(clickOnMen);
		return new MenPage(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
