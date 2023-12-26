package prosperitywealth;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeOptions edgeOptions = new EdgeOptions();
	    edgeOptions.addArguments("--inprivate"); // Use this option to enable private mode

        // Specify the path to the Edge WebDriver executable
		System.setProperty("webdriver.edge.driver", "C:\\Users\\www.abcom.in\\Downloads\\edgedriver_win64\\msedgedriver.exe");
													
		// Initialize EdgeDriver with EdgeOptions
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.manage().window().maximize();
		
		driver.get("https://www.test.prosperitywealth.in/");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        long lastHeight = (long) js.executeScript("return document.body.scrollHeight");

	        while (true) {
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	            Thread.sleep(5000); // Adjust the sleep time to control the speed of scrolling
	            long newHeight = (long) js.executeScript("return document.body.scrollHeight");
	            if (newHeight == lastHeight) {
	                break;
	            }
	            lastHeight = newHeight;
	        }
	    driver.findElement(By.className("nr-link")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[2]/a")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[4]/a")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[5]/a")).click();
	    //Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[6]/a")).click();
	    driver.findElement(By.id("floatingInput")).sendKeys("reena@webarcitech.com");
	    driver.findElement(By.id("password")).sendKeys("123456");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/section/div/div[1]/div/form/div[4]/div/button[1]")).click();
	    driver.findElement(By.className("ds-link")).click();
	    Thread.sleep(3000);
	    
	    
	   // Risk Assessment Test
	    
	    driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div[1]/div/div/div/div/a")).click();
	   
	    
	    driver.quit();

	}

}
