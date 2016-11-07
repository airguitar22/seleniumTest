import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by david.cole on 11/7/2016.
 */
public class Locator1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/David.Cole/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("davidcole27@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Dayank22");
        driver.findElement(By.id("loginbutton")).click();
        driver.close();
    }
}
