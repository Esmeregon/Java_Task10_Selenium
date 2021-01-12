import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingInPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SingInPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void successAuth() {
        driver.findElement(By.id("login_field")).sendKeys("login");
        driver.findElement(By.id("password")).sendKeys("password");
    }

    public void click() {
        driver.findElement(By.cssSelector("[value=\"Sign in\"]")).click();
    }

    public void waitSuccess() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("repos-container")));
    }

    public void failPassword() {
        driver.findElement(By.id("login_field")).sendKeys("login");
        driver.findElement(By.id("password")).sendKeys("testtest");
    }

    public void failMassage() {
        String error = driver.findElement(By.cssSelector("[class =\"container-lg px-2\"]")).getText();
        Assert.assertEquals(error, "Incorrect username or password.");
    }

    public void failUsername() {
        driver.findElement(By.id("login_field")).sendKeys("TestTest");
        driver.findElement(By.id("password")).sendKeys("password");
    }

    public void failAuthData() {
        driver.findElement(By.id("login_field")).sendKeys("TestTEst");
        driver.findElement(By.id("password")).sendKeys("TestTestTest");
    }
}
