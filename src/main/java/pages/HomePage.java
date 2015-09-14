package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {


    @FindBy(xpath="//input[@id='search_from_str']")
    protected static WebElement searchField;
    @FindBy(css=".button.big")
    protected static WebElement searchButton;
    WebDriver driver;



    public static void search(String searchStr) {

            searchField.isEnabled();

            searchField.sendKeys(searchStr);

            searchButton.click();

    }

}
