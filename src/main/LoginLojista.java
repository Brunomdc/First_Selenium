package main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginLojista {

    static WebDriver driver;

    @Test
    public void main() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("http://10.59.164.13/portal/#/");
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/section/section[2]/section/div/h1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.name("email")));
        driver.findElement(By.name("email")).sendKeys("servicoyaman719507@userede.com.br");
        driver.findElement(By.name("password")).sendKeys("Rede2017");
        driver.findElement(By.xpath("/html/body/section/section[2]/section/div/form/div[4]/button")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("mn-users")));
        String teste = driver.findElement(By.id("mn-users")).getText();
        Assert.assertEquals(teste, "extratos");
        driver.findElement(By.xpath("//div/nav/ul/a[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("bt-confirm")));
        driver.findElement(By.id("bt-confirm")).click();


        System.out.println();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
