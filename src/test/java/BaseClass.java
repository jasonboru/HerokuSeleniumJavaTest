import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {

        protected WebDriver driver;

        @BeforeMethod
        public void openBrowser() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        @AfterMethod
        public void tearDownBrowser(){
            driver.close();
        }

        @Test(priority = -20)
        public void goToWebsite(){
            driver.get("https://the-internet.herokuapp.com/");
        }
}
