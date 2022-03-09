import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Youtube {
    private static WebDriver driver;

    @BeforeClass
    public void Before_class() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Desktop\\chromedriver.exe");
    }

    @Test
    public void test01_search() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jewishmusic.fm/%D7%93%D7%A3-%D7%94%D7%91%D7%99%D7%AA-2/");
        WebElement song = driver.findElement(By.name("iva_search_input"));
        song.sendKeys("פורים");
        song.submit();
        WebElement click = driver.findElement(By.className("iva_search_btn btn greensea"));
        click.click();
        driver.quit();
    }
}
