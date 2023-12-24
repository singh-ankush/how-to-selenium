//code to access contents within a shadow root

//shadow root code in a page : #shadow-root (open)
//shadow roots are basically pages withing pages(child page)-- these are mostly used in cookie option within a page and automating them can be a serious task.
//this code can be used to access the shadow root and the contents within it.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        
        
        WebElement shadowHost = driver.findElement(By.cssSelector("//location of the root"));
            SearchContext shadowRoot = shadowHost.getShadowRoot();
            WebElement shadowContent = shadowRoot.findElement(By.cssSelector("content you want to access"));
        shadowContent.findElement(By.cssSelector("element you want to work on")).click();
    
        
        driver.close();
    }
}
