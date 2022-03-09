import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment {
    private static WebDriver driver;
    private static WebDriver driver2;
    private static WebDriver driver3;
    private static WebDriver driver4;
    private static WebDriver driver5;


    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Desktop\\chromedriver.exe");

   /*  System.setProperty("webdriver.gecko.driver","C://..geckodriver.exe");
    WebDriver fireFoxDriver = new FirefoxDriver();
    driver.get("https://github.com/mozilla/geckodriver/releases") ;*/
    }

    // תרגיל 2
    @Test (priority = 1)
    public void test01_getTitle() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/mozilla/geckodriver/releases");
        String title = driver.getTitle();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Assert.assertEquals(title, "Releases · mozilla/geckodriver · GitHub");
        driver.quit();
    }
    //2
  /*  @Test
    public void test02_refresh() {
        driver.navigate().refresh();
    }*/
//3
    @Test
    public void test02_get_URL(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/mozilla/geckodriver/releases");
        String website= driver.getCurrentUrl();
        Assert.assertEquals(website, "https://github.com/mozilla/geckodriver/releases");
    }

    //שאלה 4-
    @Test
    public void test03_find_text_area() {
        driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://translate.google.com");
        WebElement text = driver2.findElement(By.className("er8xn"));
        text.sendKeys("שלום");
        System.out.println(text);
        WebElement d = driver2.findElement(By.tagName("textarea"));
        System.out.println(d);
        WebElement id = driver2.findElement(By.id("security-tab"));
        System.out.println(id.getText());
        WebElement name= driver2.findElement(By.name("search"));
        name.sendKeys("שלום");
        System.out.println(name.getText());
        driver2.quit();
    }
    // תרגיל 4 assignment 2
    //תרגיל 5 אתר גוגל טרנסלייט
    //@Test
  //  public void test04_by_id() {{}
    //תרגיל 8
    @Test
    public void test_05_byName(){
        WebElement name= driver2.findElement(By.name("search"));
        name.sendKeys("שלום");
          System.out.println(name.getText());
    }
    @Test
    public void test06_by_name(){
        driver5 = new ChromeDriver();
        driver5.manage().window().maximize();
        driver5.get("https://www.seleniumhg.org/");
        WebElement name= driver5.findElement(By.tagName("input"));
        System.out.println(name);
        //   System.out.println(driver.findElement(By.name("")));
        name.sendKeys("selenium");
        driver5.quit();
    }
    @Test
    public void test07_assert_tittle(){
        driver3 = new ChromeDriver();
        driver3.manage().window().maximize();
        driver3.get("https://www.amazon.com/");
        System.out.println(driver3.getTitle());
        String amazon=driver3.getTitle();
        Assert.assertEquals(amazon,"Amazon.com. שלמו פחות, חייכו יותר.");
        WebElement element =driver3.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("Leather shoes");
        element.submit();
        driver3.quit();
    }
    @Test
    public void test08_search() {
        driver4= new ChromeDriver();
        driver4.manage().window().maximize();
        driver4.get("https://jewishmusic.fm/%D7%93%D7%A3-%D7%94%D7%91%D7%99%D7%AA-2/");
        WebElement song = driver4.findElement(By.name("iva_search_input"));
        song.sendKeys("פורים");
       // song.submit();
        WebElement click = driver4.findElement(By.className("iva_search_btn"));
        click.click();

    }
   /* @AfterClass
    public static void tearDown(){
        driver.quit();
    }*/

}


