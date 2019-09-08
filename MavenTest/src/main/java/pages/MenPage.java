package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MenPage {
	 WebDriver driver;

	   public MenPage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
	   }

}
