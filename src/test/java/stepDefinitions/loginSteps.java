package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginSteps {

    public loginSteps(){

    }
    @Given("user launch myntra site")
    public void user_launch_myntra_site() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("constructor");
       // WebDriver driver = new ChromeDriver();
       // driver.get("https://www.myntra.com/");
    }
    @When("clicked on login")
    public void clicked_on_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("constructor");
    }
    @Then("Login screen displays")
    public void login_screen_displays() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("constructor");
    }

}
