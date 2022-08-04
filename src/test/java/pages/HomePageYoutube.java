package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePageYoutube {
    WebDriver webDriver;

    final String SEARCH_FIELD = "//input[@id='search']";

    public HomePageYoutube(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void doFind(String item){
        webDriver.findElement(By.xpath(SEARCH_FIELD)).sendKeys(item);
        webDriver.findElement(By.xpath(SEARCH_FIELD)).sendKeys(Keys.ENTER);
    }

}
