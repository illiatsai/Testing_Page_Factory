package SearchTests;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import org.openqa.selenium.support.PageFactory;
import static org.testng.AssertJUnit.assertTrue;
import static pages.HomePage.search;


public class SearchResultsTests extends TestBase{
    protected final String SEARCH_TEXT = "Selenium WebDriver";
    protected final String SEARCH_URL = "http://docs.seleniumhq.org/projects/webdriver";

    @Test(priority = 0)
    public void searchResultsLinksCheck() {
        HomePage page = PageFactory.initElements(driver, HomePage.class);
        HomePage.search(SEARCH_TEXT);

        assertTrue("Не найдено ссылки с заданым текстом", SearchPage.checkLinkText(driver, SEARCH_TEXT));
        assertTrue("Link Url not found", SearchPage.checkLinkUrl(driver, SEARCH_URL));
    }
}
