//this code counts total number of similar webelements present in the given location

public class Element_counter {

	public static int elm_con(String str) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("//website link");
		List<WebElement> we = wd.findElements(By.xpath(str));
		int i = we.size();
		wd.quit();
		return i;
	}
	
	public static void main(String[] args) {
		elm_con("//use the location of element here");
	}
}
