package tryCloud.test.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class FindingElementByClassName {
    public static void main(String[] args)  throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        //identify the span element with class name 'h1y'
        WebElement element =driver.findElement(By.className("h1y"));
        System.out.println(element.getText());

        Thread.sleep(2000);

        //Identify first item in unordered list by using className
        WebElement firstElement =driver.findElement(By.className("list-group-item"));
        System.out.println(firstElement.getText());

        //get all text from all unordered list by using className
        List<WebElement> allItems = driver.findElements(By.className("list-group-item"));

        Assert.assertTrue(allItems.size()>=48);
        System.out.println(allItems.size());
        for (WebElement eachItem : allItems){
            System.out.println(eachItem.getText());
        }

        Thread.sleep(2000);

        driver.quit();

    }


}
