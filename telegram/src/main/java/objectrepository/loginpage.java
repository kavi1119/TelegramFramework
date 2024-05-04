package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public loginpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="Email")
	private WebElement EmailTF;
    
}
