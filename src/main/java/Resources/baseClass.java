package Resources;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

 public WebDriver driver;
 public void intializeDriver() throws IOException {
  
  // To read the data
  FileInputStream fis = new FileInputStream("C:\\Users\\ravin\\eclipse-workspace\\selenium15octproject\\src\\main\\java\\Resources\\Data.properties");

  // access the data.properties file-
  Properties prop=new Properties();
  //loading the readed file
  prop.load(fis);
  
  String browserName=prop.getProperty("browser");
  
  if(browserName.equalsIgnoreCase("chrome")) {
	  System.setProperty( "webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\Chromedriver_win32 (1)\\Chromedriver.exe");
   	
   driver = new ChromeDriver();    
  }
  
   
  System.out.println("please enter proper browser value");
   
  }
 
  
   
  
      
      
      
     
  
  
 }
 
 
 
 



   



   


	
