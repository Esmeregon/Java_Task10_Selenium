import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public StartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void openWeb() {
        driver.get("https://github.com/");
    }

    public void header() {
        driver.findElement(By.cssSelector("[href=\"/login\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-pjax-container")));
    }
}
