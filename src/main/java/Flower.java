import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flower {

    private String url;

    public Flower(String url) {
        this.url = url;
    }
    public String firstest() {
        System.setProperty("webdriver.chrome.driver", this.url);
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/");
        return driver.getCurrentUrl();

    }
    public String secondtest() {
            System.setProperty("webdriver.chrome.driver",this.url);
           WebDriver driver = new ChromeDriver();
            driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        WebElement email_create = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email_create.sendKeys("ha*****@hotmail.co.il");
        WebElement entering = driver.findElement(By.xpath("//*[@id=\"enterimg\"]"));
        entering.click();
        WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input\n"));
        Firstname.sendKeys("Hadeel");
        WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
        Lastname.sendKeys("Nassar");
        WebElement adress = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
        adress.sendKeys("Arraba, Isreal");
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
        Email.sendKeys("ha*******@hotmail.co.il");
        WebElement Phone = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
        Phone.sendKeys("052******");
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
        gender.click();
        WebElement hobbies = driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
        hobbies.click();
        WebElement language = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
        language.click();
        WebElement language1 = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a"));
        language1.click();
        WebElement form = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]"));
        form.click();
        WebElement skill = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
        skill.click();
        WebElement skill1 = driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[39]"));
        skill1.click();
        WebElement countries = driver.findElement(By.xpath("//*[@id=\"countries\"]"));
        countries.click();
        WebElement countries1 = driver.findElement(By.xpath("//*[@id=\"countries\"]"));
        countries1.click();
        WebElement country = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
        country.click();
        WebElement country1 = driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[7]"));
        country1.click();
        WebElement year = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
        year.click();
        WebElement year1 = driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[79]"));
        year1.click();
        WebElement month = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
        month.click();
        WebElement month1 = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[9]"));
        month1.click();
        WebElement day = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
        day.click();
        WebElement day1 = driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[5]"));
        day1.click();
        WebElement password = driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
        password.sendKeys("123*");
        WebElement confirmpassword = driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
        confirmpassword.sendKeys("123*");
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submitbtn\"]"));
        submit.click();
            return driver.getTitle();
        }





    }

