import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Github extends Settings{


    @Test
    public void test1() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector("[href=\"/login\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-pjax-container")));
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.id("login_field")).sendKeys("Esmeregon");
        driver.findElement(By.id("password")).sendKeys("wiesmann1esm");
        //driver.findElement(By.id("login_field")).click();
        driver.findElement(By.cssSelector("[value=\"Sign in\"]")).click();
    }

    @Test
    public void test2() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector("[href=\"/login\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-pjax-container")));
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.id("login_field")).sendKeys("Esmeregon");
        driver.findElement(By.id("password")).sendKeys("testtest");
        //driver.findElement(By.id("login_field")).click();
        driver.findElement(By.cssSelector("[value=\"Sign in\"]")).click();
    }

    @Test
    public void test3() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector("[href=\"/login\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-pjax-container")));
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.id("login_field")).sendKeys("TestTest");
        driver.findElement(By.id("password")).sendKeys("wiesmann1esm");
        //driver.findElement(By.id("login_field")).click();
        driver.findElement(By.cssSelector("[value=\"Sign in\"]")).click();
    }

    @Test
    public void test4() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector("[href=\"/login\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-pjax-container")));
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.id("login_field")).sendKeys("TestTEst");
        driver.findElement(By.id("password")).sendKeys("TestTestTest");
        //driver.findElement(By.id("login_field")).click();
        driver.findElement(By.cssSelector("[value=\"Sign in\"]")).click();
        String error = driver.findElement(By.cssSelector("[class =\"container-lg px-2\"]")).getText();
        Assert.assertEquals(error, "Incorrect username or password.");
    }

}

