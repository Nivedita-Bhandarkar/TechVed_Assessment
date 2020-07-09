package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.DependencyMap;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object_Repositories.Techved_FItness_Page_object;
import Resources.Techved_assessment_Base;

public class Techved_Fitness_home extends Techved_assessment_Base {
	WebDriver driver;
	Techved_FItness_Page_object retreive_object;

	@BeforeTest()
	public void initialization() throws IOException {
		// To intialize driver from base class
		driver = intialize_driver();
		driver.get(techved_Data.getProperty("url"));
	}

	@Test
	public void Validate_Fitness_Title() {
// Validate the title
		retreive_object = new Techved_FItness_Page_object(driver);
		Assert.assertEquals(retreive_object.Fitness_Title().getText(), "FITNESS");
	}

	@Test
	public void Validate_Redeemed_Title() {
		// Validate the title
		retreive_object = new Techved_FItness_Page_object(driver);
		Assert.assertEquals(retreive_object.Redeemed_Title().getText(), "REDEEMED");
	}

	@Test
	public void Validate_h4_element_title() {
		// Validate the title
		retreive_object = new Techved_FItness_Page_object(driver);
		Assert.assertEquals(retreive_object.h4_element_title().getText(), "Now pay per use & gym anytime");
	}

	@Test
	public void Validate_fitness_link() {
		// Validating links redirection
		retreive_object = new Techved_FItness_Page_object(driver);
		retreive_object.home_link().click();
		retreive_object.aboutFitness_link().click();
		retreive_object.benifits_link().click();
		retreive_object.gallary_link().click();

	}

@Test
public void Validate_Gallery_link() {
	// Validating Gallary count
	retreive_object = new Techved_FItness_Page_object(driver);
retreive_object.Video_link().click();
Assert.assertEquals(retreive_object.Gallery().size(), 1);
	retreive_object.All_link().click();
	Assert.assertEquals(retreive_object.Gallery().size(), 6);
	 retreive_object.photo_link().click();
	 Assert.assertEquals(retreive_object.Gallery().size(), 5);
	
}
@Test
public void Validate_benefit_block() {
	// Validating Benefits block button
	retreive_object = new Techved_FItness_Page_object(driver);
	for(int i=0;i<retreive_object.benefit_block().size();i++) {
		retreive_object.benefit_block().get(i).click();
	}
}

@Test(dependsOnMethods = {"Validate_Fitness_Title","Validate_Redeemed_Title","Validate_h4_element_title"})
public void Validate_Query_block() {
	// validating Query block
	retreive_object = new Techved_FItness_Page_object(driver);
	retreive_object.query_name().sendKeys("Nivedita Bhandarkar");
	Assert.assertFalse(retreive_object.query_email().isSelected());
	retreive_object.query_description().sendKeys("test");
	retreive_object.query_submit().click();
	
}

	@AfterTest
	public void teardown() {
		//CLosing the browser
		driver.close();
	}
}
