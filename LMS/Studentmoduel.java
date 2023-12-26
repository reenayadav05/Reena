package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Studentmoduel {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		
		

		// Set EdgeOptions to open in private mode
		EdgeOptions edgeOptions = new EdgeOptions();
	    edgeOptions.addArguments("--inprivate"); // Use this option to enable private mode

        // Specify the path to the Edge WebDriver executable
	    System.setProperty("webdriver.edge.driver","C:\\Users\\www.abcom.in\\\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		
		// Initialize EdgeDriver with EdgeOptions
				WebDriver driver = new EdgeDriver(edgeOptions);
				driver.manage().window().maximize();
				
				driver.get("http://proteacher.ai/");
				
			WebElement 	Signup = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div/div/div/div/div[3]/a[2]"));
			Signup.click();
			
			WebElement 	teacher_Signup = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/form/div/div[1]/div/div/button[2]"));
			teacher_Signup.click();
			
			WebElement teacher_username = driver.findElement(By.name("email"));
			teacher_username .sendKeys("mansi@yahoo.com");
			WebElement teacher_password = driver.findElement(By.name("password"));
			teacher_password.sendKeys("Mansi@123");
			WebElement teacher_register = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/form/div/div[3]/button"));
			teacher_register.click();
			WebElement teacher_Beginjourney = driver.findElement(By.className("begin-journey-btn"));
			teacher_Beginjourney.click();
			
			Thread.sleep(10000);
			WebElement Teacher_Profile = driver.findElement(By.className("begin-journey-btn"));
			Teacher_Profile.click();
			
			// Find the dropdown element
			WebElement Teacher_DropDownElement = driver.findElement(By.name("teacher-create-popup-gender-input"));
			
			 // Create a Select object
	        Select dropdown = new Select(Teacher_DropDownElement);

	       	        
	        
			WebElement Teacher_fname = driver.findElement(By.className("name"));
			Teacher_fname.sendKeys("Aman");
			
			
			
				
	}				
	
}
