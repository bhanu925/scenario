package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
	WebElement Admin;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")
	WebElement Qualification;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")
	WebElement Skills;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
	WebElement Add;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	WebElement SkillName;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
	WebElement Description;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	WebElement Save;
	
	
	
	public void SkillPageWebDriver(WebDriver driver1) {
		
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	public void SkillPage() {
		
		Admin.click();
		//clicking qualifications page
	    Qualification.click();
	    //clicking skills page
	    Skills.click();
	}
	
	public void Add() {
		   Add.click();
		}
		
	public void SkillDetsils(String titlename, String titileDescription) {
		   SkillName.sendKeys(titlename);
		   Description.sendKeys(titileDescription);
		}
	
	public void Save() {
		  Save.click();
		}
}
