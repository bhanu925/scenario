package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SkillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition {
	
	WebDriver driver;
	
	LoginPage LP;
	SkillsPage SP;
	HomePage HP;
	

	@Given("user launches the browser")
	public void user_launches_the_browser() {

	   driver = new EdgeDriver();
	   driver.manage().window().maximize();
	}
	@Then("user enters url as {string}")
	public void user_enters_url_as(String url) {
		LP = new LoginPage();
		LP.LoginPageDriver(driver);
		LP.SiteUrl(url);
	}
	@Then("user enters username as {string} and password as {string} click login button")
	public void user_enters_username_as_and_password_as_click_login_button(String username, String password) {
		LP.LoginPageDriver(driver);
		LP.Login(username, password);
	}
	@Then("open the qualification dropdown and open the skills page")
	public void open_the_qualification_dropdown_and_open_the_skills_page() {
		
		SP = new SkillsPage();
		SP.SkillPageWebDriver(driver);
		SP.SkillPage();		
	}
	@Then("click the add button")
	public void click_the_add_button() {
	   SP.SkillPageWebDriver(driver);
	   SP.Add();
	}
	@Then("user enters skill title as {string} and description and {string}")
	public void user_enters_skill_title_as_and_description_and(String titlename, String titileDescription) {
		SP.SkillPageWebDriver(driver);
		SP.SkillDetsils(titlename, titileDescription);
	}
	@Then("click save button")
	public void click_save_button() {
	   SP.SkillPageWebDriver(driver);
	   SP.Save();
	}
	@Then("logout")
	public void logout() {
//		HP = new HomePage();
//		HP.HomePageWebDriver(driver);
//		HP.logout();
	}
	@Then("close the browser")
	public void close_the_browser() {
	  
	}
}
