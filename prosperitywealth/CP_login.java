package prosperitywealth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;


public class CP_login  {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub

		EdgeOptions edgeOptions = new EdgeOptions();
	    edgeOptions.addArguments("--inprivate"); // Use this option to enable private mode

        // Specify the path to the Edge WebDriver executable
		System.setProperty("webdriver.edge.driver", "C:\\Users\\www.abcom.in\\\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		
													
		// Initialize EdgeDriver with EdgeOptions
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.manage().window().maximize();
		
		// URL of WEBSITE
		driver.get("https://www.test.prosperitywealth.in/");
		
		// login credentials script 
		
		driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[6]/a")).click();
		driver.findElement(By.id("floatingInput")).sendKeys("reenayadav518@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("123456");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/section/div/div[1]/div/form/div[4]/div/button[1]")).click();
	    driver.findElement(By.className("ds-link")).click();
	    Thread.sleep(3000);
	    // Add  new client  
	    driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div/a")).click();
	    driver.findElement(By.id("first_name")).sendKeys("Anish");
	    driver.findElement(By.id("last_name")).sendKeys("Mishra");
	    driver.findElement(By.id("phone")).sendKeys("4215637890");
	    driver.findElement(By.id("email")).sendKeys("koyag69905@mkurg.com");
	    //driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("11/20/1990");
	    WebElement calendarInputField = driver.findElement(By.xpath("//*[@id=\"dob\"]"));
	    calendarInputField.click();
	    WebElement desiredDate = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a"));
        
        // You may need to use WebDriverWait to wait for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(desiredDate));

        // Use Actions class to move to the element and click
        Actions actions = new Actions(driver);
        actions.moveToElement(desiredDate).click().perform();
	   //  calendarInputField.sendKeys("11/20/1990");
	  //  calendarInputField.doubleClick("11/20/1990")
	     
	   // WebElement Radiobutton =  driver.findElement(By.name("gender_id"));
	    
	 // Assuming you have the element for the radio button
	   // WebElement radioButton = driver.findElement(By.id("gender_id"));
	    //radioButton.click(); // This will select the radio button
	    
	 // Assuming you have the element for the radio button
	   // WebElement radioButton1 = driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div[1]/div[2]/div/div/div/div/div/form/div/div[5]/div/div/p[2]/label"));
	    //boolean isSelected = radioButton1.isSelected();
	    //System.out.println("Is the radio button selected? " + isSelected);
        
        
        WebDriverWait waits = new WebDriverWait(driver,  Duration.ofSeconds(10));
        WebElement maleRadioButton = waits.until(ExpectedConditions.elementToBeClickable(By.id("cust-radio")));
        maleRadioButton.click();

	    
	    
	    
	    // Click on Register 
	    
	    
	    WebElement register = driver.findElement(By.className("btn-orng-sm reg-btn"));
	    register.click();

	    
	    
	}
}