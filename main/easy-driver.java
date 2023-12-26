// this is a simple example of how to open a website in selenium without requiring to install drivers or additional files.
//this dependency is based on one provided by bonigarcia and i have just implemented it.

import io.github.bonigarcia.wdm.WebDriverManager; //you will require this library for the execution(I will provide the maven dependencies at the end for this library.)
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Ankush Singh
 */
public class easy_driver {
    public static void main(String[] args) {
        String a = "//website you wish to open";
        
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        
        driver.get(a);
        
    }
}


//maven dependency
// <dependency>
//             <groupId>io.github.bonigarcia</groupId>
//             <artifactId>webdrivermanager</artifactId>
//             <version>5.5.2</version>
//         </dependency>
