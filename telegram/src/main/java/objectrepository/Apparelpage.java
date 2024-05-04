package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Apparelpage {
public Apparelpage(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")
private WebElement ApparelLink;
public WebElement getApparelLink() {
	return ApparelLink;
}

//getter method


}
