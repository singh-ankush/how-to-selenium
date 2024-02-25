//this is a code to shift between different tabs in the webdriver. it can be used to handle multiple tabs using selenium.
//in some cases(eg. when pdfs are opened in a page), a new tab is opened and error is thrown as tabs switch without switching windows handles. this code can be useful in such cases.
public class easy_driver {
    public static void main(String[] args) {
        String a = "//website you wish to open";
        
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        
        driver.get(a);

      ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
      driver.switchTo().window(tabs.get(1)); //the index of tab you desire to shift to
      driver.close(); //to close the current tab
      driver.switchTo().window(tabs.get(0));
    }
}
