import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageEvents.HtmlElementEvents;
import utils.BaseTest;

public class TestSuite extends BaseTest {

    public static WebDriver driver;

//    @Test
//    public void openWebPage() throws InterruptedException {
//        driver = DriverFactory.getDriver("chrome");
//        driver.get("http://localhost:4200/#/");
//        Thread.sleep(10000);
//    }

    @Test
    public void signUp() throws InterruptedException {
        driver = DriverFactory.getDriver("chrome");
        driver.get("http://localhost:4200/#/");
        Thread.sleep(3000);
        HtmlElementEvents.clickButton("//*[@id=\"dropdownMenuButton1\"]/span[1]");
        HtmlElementEvents.clickButton("//*[@id=\"fixed-nav-id\"]/div/ul/a[1]");
        Thread.sleep(2000);
        HtmlElementEvents.fillTextField("//*[@id=\"mat-input-0\"]", "automateTestUser@gmail.com");
        HtmlElementEvents.fillTextField("//*[@id=\"mat-input-1\"]", "Automate123");
        HtmlElementEvents.fillTextField("//*[@id=\"mat-input-2\"]", "Automate123");
        HtmlElementEvents.fillTextField("//*[@id=\"mat-input-3\"]", "Automation");
        HtmlElementEvents.fillTextField("//*[@id=\"mat-input-4\"]", "TestUser");
        HtmlElementEvents.fillTextField("//*[@id=\"mat-input-5\"]", "0769947411");
        HtmlElementEvents.clickButton("//*[@id=\"checkbox\"]/button");
        Thread.sleep(2000);
        HtmlElementEvents.selectCheckBox("//*[@id=\"mat-checkbox-3-input\"]");
        Thread.sleep(3000);


//        String actualBtnText = String.valueOf(driver.findElement(By.xpath("//*[@id=\"fixed-nav-id\"]/div/ul/a[1]")).getText());
//        String expectedBtnText = "GP";
//        Assert.assertEquals(expectedBtnText,actualBtnText);
    }
}
