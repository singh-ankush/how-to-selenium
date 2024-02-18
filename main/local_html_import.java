// this is a code to open an html file you have created and is locally available on your system by giving file location.

public class local_html_import {
    public static void main(String[] args) {
        File f = new File("C://Downloads//file.html"); //location to your html file
        
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        
        driver.get(f.toString());
        
    }
}

