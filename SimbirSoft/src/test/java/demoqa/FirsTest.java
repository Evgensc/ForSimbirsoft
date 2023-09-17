package demoqa;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class FirsTest {
    public final String firstName = "Tanja";
    public final String lastName = "Ivanova";
    public static String userEmail() {
        return "Ivanova"+new Random().nextInt(100)+"@mail.com";
    }
    public final String userNumber = "9009110001";
public final String currentAddress ="город Самара, улица Буянова 8";
final int a=100;

    @Test
    public void firstTest(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("userEmail")).sendKeys(userEmail());
        driver.findElement(By.xpath("//*[text()='Male']")).click();
        driver.findElement(By.id("userNumber")).sendKeys(userNumber);
        driver.findElement(By.id("dateOfBirthInput")).click();
        driver.findElement(By.xpath("//div[@id='dateOfBirth']//div[text() = 5]")).click();
        driver.findElement(By.id("currentAddress")).sendKeys(currentAddress);
        driver.findElement(By.xpath("//*[text()='Sports']")).click();

        WebElement element = driver.findElement(By.xpath("//div[@id = 'subjectsContainer']//input[@id = 'subjectsInput']"));
        element.sendKeys("Arts");
        element.sendKeys(Keys.ENTER);


        WebElement element2 = driver.findElement(By.cssSelector("#stateCity-wrapper #state"));
        element2.click();
        driver.findElement(By.xpath("//div[@id = 'state']//div[contains(text(),'NCR')]")).click();

        WebElement element3 = driver.findElement(By.cssSelector("#stateCity-wrapper #city"));
        element3.click();
        driver.findElement(By.xpath("//div[@id = 'city']//div[contains(text(), 'Delhi')]")).click();
        driver.findElement(By.id("uploadPicture")).sendKeys(System.getProperty("user.dir")+"\\ima\\haha.png");
        driver.findElement(By.id("submit")).click();
    }

}
