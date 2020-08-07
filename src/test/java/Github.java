import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


public class Github extends Settings{

    @Test
    public void testSuccessAuth() {
        StartPage handler = PageFactory.initElements(driver, StartPage.class);
        handler.openWeb();
        handler.header();
        SingInPage singInPage = PageFactory.initElements(driver, SingInPage.class);
        singInPage.successAuth();
        singInPage.click();
        singInPage.waitSuccess();
    }

    @Test
    public void testFailPassword() {
        StartPage handler = PageFactory.initElements(driver, StartPage.class);
        handler.openWeb();
        handler.header();
        SingInPage singInPage = PageFactory.initElements(driver, SingInPage.class);
        singInPage.failPassword();
        singInPage.click();
        singInPage.failMassage();
    }

    @Test
    public void testFailUsername() {
        StartPage handler = PageFactory.initElements(driver, StartPage.class);
        handler.openWeb();
        handler.header();
        SingInPage singInPage = PageFactory.initElements(driver, SingInPage.class);
        singInPage.failUsername();
        singInPage.click();
        singInPage.failMassage();
    }

    @Test
    public void testFailAuthData() {
        StartPage handler = PageFactory.initElements(driver, StartPage.class);
        handler.openWeb();
        handler.header();
        SingInPage singInPage = PageFactory.initElements(driver, SingInPage.class);
        singInPage.failAuthData();
        singInPage.click();
        singInPage.failMassage();
    }

}

