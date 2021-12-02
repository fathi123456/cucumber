package stepes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepes {
    WebDriver driver;
    @Given("user open the website and go to login page")
    public void user_open_the_website_and_go_to_login_page() {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get("https://classic.crmpro.com/index.html");
      driver.manage().window().maximize();

    }

    @When("user fill email and password and click on login")
    public void user_fill_email_and_password_and_click_on_login() {
        driver.findElement(By.name("username")).sendKeys("Qacart");
        driver.findElement(By.name("password")).sendKeys("test123!");
        driver.findElement(By.xpath("//input[@class='btn btn-small' ]")).click();

    }
    @Then("user should navigate to home page")
    public void user_should_navigate_to_home_page(){
     System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'CRMPRO : Upgrade to Pro Account')]")).isDisplayed());
    }
}