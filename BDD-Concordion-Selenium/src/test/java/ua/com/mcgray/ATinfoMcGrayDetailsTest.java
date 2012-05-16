package ua.com.mcgray;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import ua.com.mcgray.pageobjects.ATinfoUserDetailsPage;

@RunWith(ConcordionRunner.class)
public class ATinfoMcGrayDetailsTest {

	private ATinfoUserDetailsPage userDetailsPage;

	@Before
	public void setUp() {
		userDetailsPage = PageFactory.initElements(new ChromeDriver(), ATinfoUserDetailsPage.class);
		userDetailsPage.open("mcgray");
	}

	public boolean testThatMcGrayDetailsPageContainsNeededText(String text) {
		return userDetailsPage.getContent().contains(text);
	}

	@After
	public void tearDown() {
		userDetailsPage.close();
	}
}
