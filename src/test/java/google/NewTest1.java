package google;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class NewTest1 
{
	RemoteWebDriver driver;
  @Test(priority=1)
  public void start() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver-win64\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.gmail.com");
	  Thread.sleep(5000);
  }
  @Test(priority=2)
  public void close()
  {
	  driver.close();
  }
}
