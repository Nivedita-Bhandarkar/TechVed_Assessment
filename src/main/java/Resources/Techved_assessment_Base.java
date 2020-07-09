package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Techved_assessment_Base {

	 WebDriver driver;
protected Properties techved_Data ;
	String file_Path =System.getProperty("user.dir");
	
	
	 public WebDriver intialize_driver() throws IOException{
	 techved_Data = new Properties();
	 FileInputStream techved_File = new FileInputStream(file_Path+"\\src\\main\\java\\Resources\\Techved.properties");
	techved_Data.load(techved_File);
	String Browsername= techved_Data.getProperty("browser");
	if(Browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",file_Path+"\\src\\main\\java\\Resources\\chromedriver.exe" );
		driver= new ChromeDriver();
	}
	else if(Browsername.equalsIgnoreCase("firefox")) {
		System.getProperty("webdriver.gecko.driver",file_Path+"\\src\\main\\java\\Resources\\geckodriver.exe" );
		driver= new FirefoxDriver();
		}
	else {
		System.getProperty("webdriver.ie.driver",file_Path+"\\src\\main\\java\\Resources\\IEDriverServer.exe" );
		driver= new InternetExplorerDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	 
}
