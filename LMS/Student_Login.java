package LMS;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
public class Student_Login {

	public static void main(String[] args) throws InterruptedException {
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
			
			// Login With Student Credentials 
			
			
			// Click on login as Student 
			
			 WebElement 	Student_click_login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div/div/div/div/div[3]/a[1]"));
			   	Student_click_login.click();
			   	
			// Enter student email id 
			 WebElement Student_email = driver.findElement(By.name("email"));
				Student_email.sendKeys("anit@gmail.com");
				
			// Enter student password 
			 WebElement Student_password = driver.findElement(By.name("password"));
			   Student_password.sendKeys("Anit@123");
			   
			   // Click on login after entering credentials 
			
			 WebElement Student_login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/form/div/div[4]/button"));
			    Student_login.click();
			    
			    Thread.sleep(10000);
			
			  WebElement setup_profile = driver.findElement(By.className("begin-journey-btn"));
			    setup_profile.click();
			
			// Student Profile Details 
			
			// 1. Text data of  Full name 
			
			WebElement Student_name  = driver.findElement(By.name("name"));
				Student_name .sendKeys("Amisha Patel");
			
			//2. Text data of grade 
			
			WebElement Student_grade  = driver.findElement(By.name("grade"));
			
			// Create a  Select object 
			
			Select dropdown = new Select(Student_grade);
			
			
			   // Select by visible text
	        dropdown.selectByVisibleText("Grade 8"); // Replace with the visible text of the option you want to select
			
	        
	        
	        // Writing script for country code drop down 
	        
	        WebElement Student_countrycode = driver.findElement(By.className("teacher-create-popup-gender-input"));
	        
	        // Create Select object for country code 
	        
	        Select dropdown_CC = new Select(Student_countrycode);
	        
	       dropdown_CC.selectByVisibleText("India (भारत) +91");
	       
	       
	       // Enter mobile number 
	       
	       WebElement Student_PhoneNo = driver.findElement(By.name("phone"));
	       	Student_PhoneNo.sendKeys("9730642015");
	       
	       	// Date picker script 
	       	
	       	//Locate the date picker element and click to open the calendar
	       	
	       	WebElement Student_DOB = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[3]/div[2]/div[1]/div[5]/div[1]/input"));
	       		Student_DOB.click();
	       		
	       	// Locate and select the desired date in the calendar
	        WebElement desiredDate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[3]/div[2]/div[1]/div[5]/div[1]/div/div/table/tbody/tr[3]/td[2]")); // Replace with the desired date
	            desiredDate.click();
	       	
	        // Locate Gender of student 
	            
	       WebElement Student_Gender = driver.findElement(By.name("gender"));
	       
	       // Select dropdown for gender
	       
	       Select dropdown_Gender= new Select(Student_Gender);
	       
	       // Create select object for gender
	       
	       dropdown_Gender.selectByVisibleText("Female");
	       
	       
	       // Locate country  of student 
           
	       WebElement Student_Country = driver.findElement(By.name("language"));
	       
	       // Select dropdown for country
	       
	       Select dropdown_Country= new Select(Student_Country);
	       
	       // Create select object for country
	       
	       dropdown_Country.selectByVisibleText("English");
	       
	       // Location 
	       
	      WebElement Student_location = driver.findElement(By.name("location"));
	    	Student_location.sendKeys("Mumbai, Maharashtra, India");
	      
	    	// Click on next button
	    	
	    WebElement NextButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[3]/div[3]/button"));
	    	NextButton.click();
	    	
	    	
	    // Student profile pic
	    	
	   WebElement Profile_input = driver.findElement(By.xpath("//*[@id=\"choos-profile-image\"]"));
	   		
	   		
	   	// Provide the file path to upload
	        String filePath = "C:\\Users\\www.abcom.in\\Pictures\\Screenshots\\srds.jpg"; 
	        
	     // Send the file path to the file input element
	        Profile_input.sendKeys(filePath);
	        Profile_input.click();
	     // Wait for the upload process to complete (adjust the time as needed)
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    	
	        // Introduce your self 
	        
	    //driver.findElement(By.className("introduce-yourself-title")).sendKeys("abc");
	    
	 // Locate the textarea field using XPath
	    WebElement textareaField = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[3]/div[2]/textarea"));

	    // Clear any existing text in the textarea (if needed)
	    textareaField.clear();

	    // Input text into the textarea
	    String introductionText = "I am a student passionate about learning new things.";
	    textareaField.sendKeys(introductionText);

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	}
