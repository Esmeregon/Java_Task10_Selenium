import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\disakov\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://github.com/");
    }

    @After
    public void quit(){
        driver.quit();
    }

}
