package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePageYoutube;

import java.util.concurrent.TimeUnit;

public class login {
    WebDriver driver;

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.drive", "chromedriver");
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Given("the user access page {string}")
    public void the_user_is_on_login_page(String string) {
        driver.get(string);
    }

    @When("the user do search {string}")
    public void the_user_do_search(String string) {
        HomePageYoutube homePageYoutube = new HomePageYoutube(driver);
        homePageYoutube.doFind(string);

    }

}
