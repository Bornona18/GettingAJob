package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GooogleHome;



public class GoogleSearch0 extends GoogleBase{
	
	GooogleHome gh;

	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
//		WebDriverManager.chromedriver().setup();
//		 driver = new ChromeDriver();
//		 
//		 //driver.get("https://www.amazon.com/");
//		 driver.get("https://www.google.com/");
//		 driver.manage().window().maximize();
		
		launchbrowser();
		
	}
	

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
//		WebElement searchBox;
//		searchBox= driver.findElement(By.name("q"));
//		searchBox.sendKeys(string);
		
		gh = new GooogleHome(driver);
		gh.enterSearch(string);
		
		
	}
	

	@When("click on the google search button")
	public void click_on_the_google_search_button() {
		
//		WebElement searchBtn;
//		searchBtn =driver.findElement(By.name("btnK"));
//		
//		searchBtn.submit();
		gh.clickSearch();
	}
	

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		
		WebElement resultStats;
		resultStats=driver.findElement(By.id("result-stats"));
		String results = resultStats.getText();
		
		
		System.out.println("#################################################");
		System.out.println(results);
		System.out.println("#################################################");
		
		closeBrowser();
		
	}

}
