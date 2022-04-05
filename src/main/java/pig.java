import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pig {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
       // driver.manage().window().maximize();
        WebElement email_create = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
       // WebElement serchtextbox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
      //  serchtextbox.sendKeys("duck car swing");
//WebElement serch = driver.findElement(By.id("nav-search-submit-button"));
//serch.click();
        WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        Firstname.sendKeys("Hadeel");
        WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        Firstname.sendKeys("Nassar");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        password.sendKeys("12345");


    }
}
