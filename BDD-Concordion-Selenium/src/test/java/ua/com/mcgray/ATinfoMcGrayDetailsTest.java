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

	private ATinfoUserDetailsPage detailsPage;

	@Before
	public void setUp() {
		detailsPage = PageFactory.initElements(new ChromeDriver(), ATinfoUserDetailsPage.class);
		detailsPage.open("mcgray");
	}

	public boolean testThatUserPageContains(String text) {
		return detailsPage.getContent().contains(text);
	}

	@After
	public void tearDown() {
		detailsPage.close();
	}

}
