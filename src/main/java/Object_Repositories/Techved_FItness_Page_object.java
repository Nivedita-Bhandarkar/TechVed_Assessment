package Object_Repositories;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Techved_FItness_Page_object {

	WebDriver driver;

	public Techved_FItness_Page_object(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".col-md-6.leaderboard-banner-content h1")
	WebElement Fitness_Title;

	public WebElement Fitness_Title() {
		return Fitness_Title;

	}

	@FindBy(css = ".col-md-6.leaderboard-banner-content h2")
	WebElement Redeemed_Title;

	public WebElement Redeemed_Title() {
		return Redeemed_Title;
	}

	@FindBy(css = ".col-md-6.leaderboard-banner-content h4")
	WebElement h4_element_title;

	public WebElement h4_element_title() {
		return h4_element_title;
	}

	@FindBy(xpath = "//div[@id='navbar']/ul/li[1]")
	WebElement home_link;

	public WebElement home_link() {
		return home_link;
	}

	@FindBy(xpath = "//div[@id='navbar']/ul/li[2]")
	WebElement aboutFitness_link;

	public WebElement aboutFitness_link() {
		return aboutFitness_link;
	}

	@FindBy(xpath = "//div[@id='navbar']/ul/li[3]")
	WebElement benifits_link;

	public WebElement benifits_link() {
		return benifits_link;
	}

	@FindBy(xpath = "//div[@id='navbar']/ul/li[4]")
	WebElement gallary_link;

	public WebElement gallary_link() {
		return gallary_link;
	}

	@FindBy(xpath = "//*[text()='ABOUT FITNESS']")
	WebElement about_fitness_title;

	public WebElement about_fitness_title() {
		return about_fitness_title;
	}

	@FindBy(css = "#tabs .active")
	 WebElement Video_link;

	public WebElement Video_link() {
		
		return Video_link;
	}

	@FindBy(xpath = "//ul[@id='tabs']/li[2]")
	WebElement All_link;

	public WebElement All_link() {
		return All_link;
	}

	@FindBy(xpath = "//ul[@id='tabs']/li[3]")
	WebElement photo_link;

	public WebElement photo_link() {
		return photo_link;
	}
	
	@FindBy(css="#videos .row div div  div ")
	List<WebElement> Gallery;
	public List<WebElement> Gallery() {
		return Gallery;
	}
	
	@FindBy(css=".benefit-block .btn")
	List<WebElement> benefit_block;
	public List<WebElement> benefit_block() {
		return benefit_block;
	}
	
	@FindBy(css="#name")
	WebElement name;
	public WebElement query_name() {
		return name;
	}
	
	@FindBy(css="#email")
	WebElement email;
	public WebElement query_email() {
		return email;
	}
	
	@FindBy(css="#pwd")
	WebElement info;
	
	public WebElement query_description() {
		return info;
	}
	
	@FindBy(xpath="//form[@action='/action_page.php']/button")
	WebElement submit;
	
	public WebElement query_submit() {
		return submit;
	}
}
