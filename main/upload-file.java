import io.github.bonigarcia.wdm.WebDriverManager; //you can find the implementation of this in my easy-driver.java file.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Ankush Singh
 */
public class fixed_to_static {
    public static void main(String[] args) {
        String a = "//website with shadow-root";
        
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        
        driver.get(a);

WebElement file = driver.findElement(By.xpath("//path to your web element"));

file.sendKeys("//location of your file for rg:C:\\Computer\\file.txt");

      driver.close();

    }
}

