package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomepage {
	public class WelcomePage {

		public WelcomePage(WebDriver driver){
		PageFactory.initElements(driver, this);

		}
		@FindBy(linkText = "BOOKS")
		private WebElement bookslink;
		@FindBy(linkText = "Log in")
        private WebElement getLoginLink;

		public WebElement getGetLoginLink() {
			return getLoginLink;
		}

		public WebElement getBookslink() {
		return bookslink;
		}


		}

}
