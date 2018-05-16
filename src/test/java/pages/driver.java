package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class driver implements WebDriver{

    WebDriver driver;
    String browserName;


    public driver(String browserName){
        this.browserName = browserName;

        if (browserName.equalsIgnoreCase("firefox")){
            this.driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("chrome")){
            this.driver = new ChromeDriver();
        }
    }

    public void get(String s) {
        this.driver.get(s);
    }

    public String getCurrentUrl() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public List <WebElement> findElements(By by) {
        return null;
    }

    public WebElement findElement(By by) {
        return null;
    }

    public String getPageSource() {
        return null;
    }

    public void close() {

    }

    public void quit() {
        this.driver.quit();
    }

    public Set <String> getWindowHandles() {
        return null;
    }

    public String getWindowHandle() {
        return null;
    }

    public TargetLocator switchTo() {
        return null;
    }

    public Navigation navigate() {
        return null;
    }

    public Options manage() {
        return null;
    }
}
