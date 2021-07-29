import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogeSearch {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Malini\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.cssSelector("#username")).sendKeys("malinisenthil98@abc.org");
        driver.findElement(By.cssSelector("input#password")).sendKeys("apple098");
        driver.findElement(By.cssSelector("input#Login")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error")).getText());

    }
}
