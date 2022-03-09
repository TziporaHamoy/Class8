import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazon {
    private static WebDriver driver;
    @BeforeClass
    public void Before_class(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Desktop\\chromedriver.exe");
    }
    @Test
    public void test01_assert_tittle(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
       String amazon=driver.getTitle();
      Assert.assertEquals(amazon,"Amazon.com. שלמו פחות, חייכו יותר.");
     WebElement element =driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("Leather shoes");
        element.submit();
        driver.quit();
    }
}
