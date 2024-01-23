// this is a code to continuously test a number of similar pages or forms using selenium.
// i am going to use POI as well for this code.

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.logging.Level;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class forms_normal {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis;
			  XSSFWorkbook wk;
			  XSSFSheet sh;
			  fis = new FileInputStream("C:\\testing.xlsx");
		      wk = new XSSFWorkbook(fis);
		      sh = wk.getSheet("Sheet2");
		      
		      for(int i = 1; i<=sh.getLastRowNum(); i++) {
		      	XSSFRow rw = sh.getRow(i);
		      	XSSFCell un = rw.getCell(0);

				WebDriverManager.chromedriver().setup();

				WebDriver driver = new ChromeDriver();

				driver.get(un.getStringCellValue()); // what this does is it picks up links for the pages from the excel sheet and continuously runs them until all links are run.

        //below are just some example of what you can do with all the pages in the excel sheet.(This code is strictly for similar pages.)
				driver.findElement(By.id("first-name")).sendKeys("test");
				driver.findElement(By.id("last-name")).sendKeys("test");
				driver.findElement(By.id("email")).sendKeys("test@test.com");
				driver.findElement(By.id("mobile-no")).sendKeys("0235425432");
				Select time = new Select(driver.findElement(By.id("timeFrame")));
				time.selectByIndex(2);
				Select cars = new Select(driver.findElement(By.id("period")));
				cars.selectByIndex(5);
				Select deal = new Select(driver.findElement(By.id("preferredDealer")));
				deal.selectByIndex(3);
				driver.findElement(By.id("consent1")).click();
				WebElement we = driver.findElement(By.id("btnSubmit"));
				assertEquals(true, we.isEnabled());
		      	
		      	fis.close();
		      	driver.quit();
		      	
		      	System.out.println("link - "+un);
		      	
		      	System.out.println("Success");
		      	System.out.println();
		      	System.out.println();
		      	
		      }
		      System.out.println("All tests successfull");
		
		
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}}
