import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageEvents.HtmlElementEvents;
import utils.BaseTest;

public class TestSuite extends BaseTest {

    public static WebDriver driver;

    @Test
    public void openWebPage() throws InterruptedException {
        driver = DriverFactory.getDriver("chrome");
        driver.get("http://localhost:4200/#/");
        Thread.sleep(10000);
    }

    @Test
    public void signUp() throws InterruptedException {
        driver = DriverFactory.getDriver("chrome");
        driver.get("https://dev.mygpportal.com.au/#/");
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
    @Test
    public void loginTest() throws InterruptedException {
        driver = DriverFactory.getDriver("chrome");
        driver.get("https://dev.mygpportal.com.au/#/");
        Thread.sleep(2000);
        HtmlElementEvents.clickButton("//*[@id=\"fixed-nav-id\"]/div/button[1]");
        Thread.sleep(1000);
        HtmlElementEvents.fillTextField("/html/body/app-root/app-login/section/form/div/div[1]/input","ad.mygpportal@gmail.com");
        HtmlElementEvents.fillTextField("//*[@id=\"myInput\"]","admin1234@Mygpportal");
        HtmlElementEvents.clickButton("/html/body/app-root/app-login/section/form/div/button");
        Thread.sleep(2000);
        String actual=driver.findElement(By.xpath("/html/body/app-root/app-home-page/div[1]/app-welcome-tag/div/h4")).getText();
        System.out.println(actual);
        Assert.assertEquals(actual,"Welcome to myGPportal");

    }

    public void login() throws InterruptedException {
        driver = DriverFactory.getDriver("chrome");
        driver.get("https://dev.mygpportal.com.au/#/");
        Thread.sleep(2000);
        HtmlElementEvents.clickButton("//*[@id=\"fixed-nav-id\"]/div/button[1]");
        Thread.sleep(1000);
        HtmlElementEvents.fillTextField("/html/body/app-root/app-login/section/form/div/div[1]/input","ad.mygpportal@gmail.com");
        HtmlElementEvents.fillTextField("//*[@id=\"myInput\"]","admin1234@Mygpportal");
        HtmlElementEvents.clickButton("/html/body/app-root/app-login/section/form/div/button");
        Thread.sleep(2000);
    }

    @Test
    public void advertiseJobTest() throws InterruptedException {
        login();
        driver.get("https://dev.mygpportal.com.au/#/gpJobsAdvertise");
        Thread.sleep(2000);
        HtmlElementEvents.fillTextField("/html/body/app-root/app-gp-jobs-advertise/div/div/div[1]/div/div/div/form/div[1]/div/input","Software Engineer");
        Thread.sleep(1000);
        HtmlElementEvents.clickButton("/html/body/app-root/app-gp-jobs-advertise/div/div/div[1]/div/div/div/form/div[2]/div/div/button");
        Thread.sleep(1000);
        HtmlElementEvents.selectCheckBox("//*[@id=\"billing0\"]");
        HtmlElementEvents.clickButton("/html/body/app-root/app-gp-jobs-advertise/div/div/div[1]/div/div/div/form/div[2]/div/div/button");
        Thread.sleep(1000);
        HtmlElementEvents.clickButton("/html/body/app-root/app-gp-jobs-advertise/div/div/div[1]/div/div/div/form/div[3]/div/div[1]/label");
        HtmlElementEvents.clickButton("/html/body/app-root/app-gp-jobs-advertise/div/div/div[1]/div/div/div/form/div[4]/div/div[2]/label");
        HtmlElementEvents.clickButton("/html/body/app-root/app-gp-jobs-advertise/div/div/div[1]/div/div/div/form/div[5]/div/div[1]/label");
        HtmlElementEvents.clickButton("/html/body/app-root/app-gp-jobs-advertise/div/div/div[1]/div/div/div/form/div[6]/div/div[2]/label");
        HtmlElementEvents.clickButton("/html/body/app-root/app-gp-jobs-advertise/div/div/div[1]/div/div/div/form/div[7]/div/div[1]/label");
        HtmlElementEvents.fillTextField("/html/body/app-root/app-gp-jobs-advertise/div/div/div[1]/div/div/div/form/div[8]/div/textarea","test test test");
        HtmlElementEvents.uploadFile("//*[@id=\"upload-image\"]","C:\\Users\\PasinduKaushan\\Pictures\\sampleFile.jpeg");
        Thread.sleep(3000);
        HtmlElementEvents.clickButton("/html/body/app-root/app-gp-jobs-advertise/div/div/div[1]/div/div/div/div/div[2]/div/button[2]");
        Thread.sleep(2000);
        String actual=driver.findElement(By.xpath("//*[@id=\"mat-dialog-title-0\"]")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(actual,"Thanks! Your ad is now live!");
//        String actual=driver.findElement(By.xpath("//*[@id=\"mat-dialog-title-0\"]")).getText();
//        System.out.println(actual);
//        Assert.assertEquals(actual,"Thanks! Your ad is now live!");


    }
}
