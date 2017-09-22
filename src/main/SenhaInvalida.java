package main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SenhaInvalida {

    static WebDriver driver;

    @Test
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno.moreira\\IdeaProjects\\Projeto_maroto\\resource\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://10.59.164.13/portal/#/");
        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.elementToBeClickable(By.name("email")));
        driver.findElement(By.name("email")).sendKeys("servicoyaman720477@userede.com.br");
        driver.findElement(By.xpath("/html/body/section/section[2]/section/div/form/div[4]/button")).click();
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@class='message-notification']//span"), "Usuário e/ou senha inválidos. Por favor, tente novamente."));
        String teste = driver.findElement(By.xpath("//*[@class='message-notification']//span")).getText();
        Assert.assertEquals(teste, "Usuário e/ou senha inválidos. Por favor, tente novamente.");

        driver.findElement(By.name("password")).sendKeys("Rede2017");
        driver.findElement(By.xpath("/html/body/section/section[2]/section/div/form/div[4]/button")).click();
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@class='message-notification']//span"), "Usuário e/ou senha inválidos. Por favor, tente novamente."));
        String teste1 = driver.findElement(By.xpath("//*[@class='message-notification']//span")).getText();
        Assert.assertEquals(teste1, "Usuário e/ou senha inválidos. Por favor, tente novamente.");

        System.out.println(teste);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }
}
