package tryCloud.test.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingElementsTagName {
    public static void main(String[] args) throws InterruptedException {

       WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        //identify and save the first element with <a> tag
        WebElement firstLink = driver.findElement(By.tagName("a"));

        //print out the text
        System.out.println(firstLink.getText());

        //identify and save all the elements with <a> tag
        List<WebElement> allLinks =driver.findElements(By.tagName("a"));

        System.out.println(allLinks.size());

        //iterate over this list and get the text of all the link WebElement
        for (WebElement eachLink : allLinks){

            System.out.println(eachLink.getText());
        }

        Thread.sleep(2000);
        //click on the link
        allLinks.get(allLinks.size()-1).click();

        Thread.sleep(4000);
        //close browser
        driver.quit();

    }


}
