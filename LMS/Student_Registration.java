package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Student_Registration {

	public static void main(String[] args) {
		
		
		// Set EdgeOptions to open in private mode
				EdgeOptions edgeOptions = new EdgeOptions();
			    edgeOptions.addArguments("--inprivate"); // Use this option to enable private mode

		        // Specify the path to the Edge WebDriver executable
			    System.setProperty("webdriver.edge.driver","C:\\Users\\www.abcom.in\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
				
				
				// Initialize EdgeDriver with EdgeOptions
						WebDriver driver = new EdgeDriver(edgeOptions);
						driver.manage().window().maximize();
						
						driver.get("http://mycro.news/");
	
						
						// Student Registration 
						
						WebElement  Signup = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div/div/div/div/div[3]/a[2]"));
						Signup.click();
						
						// Click on Student tab
						
						
						WebElement Student_tab = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/form/div/div[1]/div/div/button[1]"));
						Student_tab.click();
						
						// Student user name as email 
						
						
						WebElement Student_email = driver.findElement(By.name("email"));
						Student_email.sendKeys("anita1@gmail.com");
						
						
						// Student password
						
						WebElement Student_password = driver.findElement(By.name("password"));
						Student_password.sendKeys("Anit@123");
						
						
						WebElement clickonRegister = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/form/div/div[3]/button"));
						clickonRegister.click();
						
						
						
						
						
						
						
						
	}

}
