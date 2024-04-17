import org.openqa.selenium.By;

public class LogIn extends BaseClass {

        public void preformLogIn() {
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.className("radius")).click();

    }
}

