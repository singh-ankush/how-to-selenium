String a = "//page u want to scroll";

//this is an easy way to open chrome as a driver where you dont require any reference to the webdriver
WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        
        driver.get(a);

WebElement x = driver.findElement(By.tagName("body"));

//code to custom scroll the page from top to bottom
try{
        for(int i = 0; i<x.getRect().getDimension().getHeight() ;i++){

            //you can change the value after "i+" to increase or decrease the scroll speed
            int y = i+25;
            
            //this will scroll the page from top to bottom
            js.executeScript("window.scrollTo("+i+","+y+")");
        i=y;
            
        }
        //you can program the bottom to top scrolling in the similar way