//This is a code to check whether an element is disabled or enabled in a website. i.e. disabled="true/false"
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class element_status {

	public static void main(String[] args) {
        String a = "//website link";
      
      WebDriverManager.chromedriver().setup();
      
      driver = new ChromeDriver();
      
      driver.get(a);
    
		WebElement we = driver.findElement(By.id("//id for the enabled/disabled element's status."));
	  assertEquals(true, we.isEnabled());
	}

}
