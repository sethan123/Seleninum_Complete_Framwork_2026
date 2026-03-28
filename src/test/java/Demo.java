import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

@Test
public void test1() {
	System.out.println("This is my first test");
	
	WebDriverManager.chromedriver().setup();
	webdriver driver = new ChromeDriver();
	
}
	
	
}
