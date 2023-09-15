import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Seleniumweborderingtest {

    //import the WebDriver
    private WebDriver driver;
    @BeforeTest
    public void begin() throws InterruptedException {

        //locate the Webdriver
        System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
        Thread.sleep(5000);

        // locate the chrome driver
        driver = new ChromeDriver();
        Thread.sleep(5000);

        // input URL
        driver.get("https://www.konga.com/");
        Thread.sleep(5000);

        //maximize page
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    @Test
    public void login() throws InterruptedException {

        //click on log in
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();

        // input gmail
        driver.findElement(By.id("username")).sendKeys("eberen07@gmail.com");
        Thread.sleep(5000);

        // input password
        driver.findElement(By.id("password")).sendKeys("Okereke36");
        Thread.sleep(5000);

        //log in
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/section/section/aside/div[2]/div/form/div[3]/button"));
        Thread.sleep(5000);
    }
    public void category() throws InterruptedException {
        Thread.sleep(5000);

        // navigate to categories
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[1]")).click();
        // select computers and accessories
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[1]/div/div[1]/ul")).click();
        // select laptops
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[3]/a/label/span")).click();
        // select apple machbook
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li/a/ul/li[1]/a/label/span")).click();
        // add item to cart
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/section/section/section/ul/li[1]/div/div/div[3]/form/div[4]/button")).click();
        // navigate to my cart
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/a[2]/span[1]")).click();
        // select checkout
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/section/section/aside/div[3]/div/div[2]/button")).click();
        // navigate to select pick up location
        driver.findElement(By.xpath( "//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[2]/div[3]/div[2]/div[1]")).click();
        // navigate to choose state
         driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section")).click();
        // select lagos
    }
    public void quit() {
        driver.close();
    }
    }