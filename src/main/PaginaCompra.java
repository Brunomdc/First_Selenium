package main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaginaCompra {

    static WebDriver driver;

    @Test
    public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno.moreira\\IdeaProjects\\Projeto_maroto\\resource\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://10.59.164.13/portal/#/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/section/section[2]/div[1]/div/div[3]/div[1]/a[2]")).click();
        String teste = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/div/h1")).getText();
        Assert.assertEquals(teste, "Comprar pela internet agora\né simples: clique e pague!");

        System.out.println(teste);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
