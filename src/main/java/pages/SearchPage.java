package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class SearchPage {
    @FindBy(className="b-results-list")
    static WebElement RESULTS_LIST;
    @FindBy(xpath="//a[contains(@target,'blank')]")
    static WebElement RESULT;



    public static boolean checkLinkText(WebDriver driver, String linkText) {
        List<WebElement> linksList = (List<WebElement>) RESULT;
        //boolean linkExists = false;

        for (WebElement webElement : linksList) {
            String actualText = webElement.getText();
            if (webElement.getText().equals(linkText)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkLinkUrl(WebDriver driver, String linkUrl) {
        List<WebElement> linksList = (List<WebElement>) RESULT;
        //boolean linkExists = false;

        for (WebElement webElement : linksList) {
            if (webElement.getAttribute("href").equals(linkUrl)) {
                return true;
            }
        }
        return false;
    }
}
