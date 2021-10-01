import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import javax.naming.Name;

public class Reregistration {
    public static void main(String[] args) {
        launch_Chrome();

    }

    //step 1//1.launch_Chrome 2.get registration page 3.fill up the form 4.close chrome
    public static void launch_Chrome(){

        System.setProperty("webdriver.chrome.driver","F:\\softwaretesting\\trying\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Md Rabiul");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Islam");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("sohailbracu@gmail.com");
        driver.findElement (By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("01971948307");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Sohail222");
        driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("Sohail222");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
        driver.close();


    }




  














    }



