package ua.com.mcgray.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ATinfoUserDetailsPage {

	private final WebDriver webDriver;

	@FindBy(xpath = "//dd[@class='profile-profile_blog']/a")
	private WebElement blogAnchor;

	@FindBy(xpath = "//dd[@class='profile-profile_description']")
	private WebElement descriptionParagraph;

	public ATinfoUserDetailsPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public void open(String username) {
		webDriver.get("http://automated-testing.info/users/" + username);
	}

	public String getContent() {
		return blogAnchor.getText() + " " + descriptionParagraph.getText();
	}

	public void close() {
		webDriver.close();
	}

}
