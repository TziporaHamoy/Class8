import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    private static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com");
       WebElement ele= driver.findElement(By.className("QFw9Te"));
        System.out.println(ele);
        List <WebElement> ele2 = driver.findElements(By.tagName("h1"));
        System.out.println(ele2.size());
        for (int i=0; i< ele2.size(); i++){
        if(ele2.get(i).getText()==" תרגום טקסט");
            {
                System.out.println(ele2.get(i).getText());
            }

            }
     /*   WebElement el = driver.findElement(By.className(""));
        el.sendKeys("dog");
        el.clear();*/
    }
}
