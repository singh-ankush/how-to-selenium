String a = "//page u want to scroll";

String b = "//location u want to save the screenshot";

WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        
        driver.get(a);

        //code to take the screenshot(Shutterbug)
        Shutterbug.shootPage(driver,Capture.FULL_SCROLL,true).withName("//name of the screenshot"+"-Desktop").save(b);

        //You can use Ashot but shutterbug is more reliable and accurate