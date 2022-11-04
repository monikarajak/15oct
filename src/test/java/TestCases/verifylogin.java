package TestCases;



import java.io.IOException;

import org.testng.annotations.Test;


import Resources.baseClass;

public class verifylogin extends baseClass{	@Test
public void login() throws IOException{ 
	
		intializeDriver();
		driver.get("https://login.salesforce.com");
}
}