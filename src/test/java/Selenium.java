import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selenium {
    private static WebDriver driver;

    @BeforeClass
    public void Before_class() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Desktop\\chromedriver.exe");

    }
    @Test
    public void test01_by_name(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumhg.org/");
        WebElement name= driver.findElement(By.tagName(""));
        System.out.println(name);
     //   System.out.println(driver.findElement(By.name("")));
        name.sendKeys("selenium");
    }
}
