package main;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Credenciamento {

    static WebDriver driver;
    int cont = 0;

    @Test
    public void main() throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno.moreira\\IdeaProjects\\Projeto_maroto\\resource\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://10.59.164.13/credenciamento/#/");
        print();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset/div[1]/input")));
        String teste = driver.findElement(By.xpath("//label[contains(text(),'nome completo do responsável')]")).getText();
        Assert.assertEquals(teste, "nome completo do responsável");
        driver.findElement(By.xpath("//fieldset/div[1]/input")).sendKeys("Teste brow");

        String teste1 = driver.findElement(By.xpath("//label[contains(text(),'telefone celular')]")).getText();
        Assert.assertEquals(teste1, "telefone celular");
        driver.findElement(By.name("mobilePhone")).sendKeys("11993797873");

        String teste2 = driver.findElement(By.xpath("//label[contains(text(),'telefone comercial')]")).getText();
        Assert.assertEquals(teste2, "telefone comercial");
        driver.findElement(By.name("businessPhone")).sendKeys("1120212223");

        String teste3 = driver.findElement(By.xpath("//fieldset/div[3]/label")).getText();
        Assert.assertEquals(teste3, "e-mail");
        driver.findElement(By.xpath("//fieldset/div[3]/input")).sendKeys("teste@com.us");

        String teste4 = driver.findElement(By.xpath("//fieldset/div[4]/label")).getText();
        Assert.assertEquals(teste4, "confirme o e-mail");
        driver.findElement(By.xpath("//div[4]/input")).sendKeys("teste@com.us");

        String teste5 = driver.findElement(By.xpath("//fieldset/div[5]/label")).getText();
        Assert.assertEquals(teste5, "senha");
        driver.findElement(By.xpath("//fieldset/div[5]/input")).sendKeys("Teste123");

        String teste6 = driver.findElement(By.xpath("//input[@rc-blur-event='PASSWORD']")).getAttribute("type");
        Assert.assertEquals(teste6, "password");
        driver.findElement(By.xpath("//div[5]/div/div/label")).click();

        String teste7 = driver.findElement(By.xpath("//input[@rc-blur-event='PASSWORD']")).getAttribute("type");
        Assert.assertEquals(teste7, "text");
        driver.findElement(By.xpath("//input[@value='continuar']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='company-info']//h3")));
        String teste8 = driver.findElement(By.xpath("//section[@class='company-info']//h3")).getText();
        Assert.assertEquals(teste8, "Dados da empresa");

        String teste9 = driver.findElement(By.xpath("//fieldset/div/label")).getText();
        Assert.assertEquals(teste9, "CNPJ");
        driver.findElement(By.id("cnpj")).sendKeys("63715010000123");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("addCpf")));
        String teste10 = driver.findElement(By.xpath("//fieldset/div[2]/label")).getText();
        Assert.assertEquals(teste10,"adicionar CPF/CNPJ do(s) sócio(s)");
        driver.findElement(By.id("addCpf")).sendKeys("71165553589");
        driver.findElement(By.xpath("//*[@id='company']/section/form/fieldset/div[2]/button")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset[2]/div[2]/input")));
        String teste11 = driver.findElement(By.xpath("//fieldset[2]/div[2]/label")).getText();
        Assert.assertEquals(teste11,"Nome exibido na fatura do cliente");
        driver.findElement(By.xpath("//fieldset[2]/div[2]/input")).sendKeys("Fatura");

        String teste12 = driver.findElement(By.xpath("//fieldset[2]/div[3]/label")).getText();
        Assert.assertEquals(teste12,"nome fantasia");
        driver.findElement(By.xpath("//fieldset[2]/div[3]/input")).sendKeys("nome fantasia");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset[2]/div[4]/input")));
        String teste13 = driver.findElement(By.xpath("//fieldset[2]/div[4]/label")).getText();
        Assert.assertEquals(teste13,"site do seu estabelecimento");
        driver.findElement(By.xpath("//fieldset[2]/div[4]/input")).sendKeys("www.teste.com");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/input[1]")));
        String teste14 = driver.findElement(By.xpath("//section/form/div/input[1]")).getAttribute("value");
        Assert.assertEquals(teste14, "continuar");
        driver.findElement(By.xpath("//form/div/input[1]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset[1]/select[1]//option[@value='0']")));
        String teste15 = driver.findElement(By.xpath("//fieldset[1]/select[1]/option[1]")).getText();
        Assert.assertEquals(teste15,"Faturamento mensal");
        driver.findElement(By.name("listMonthlyInvoicing")).click();
       // new Actions(driver).moveToElement((WebElement) By.name("listMonthlyInvoicing")).click();







        //driver.findElement(By.xpath("/html/body/section/section[2]/section/div/form/div[4]/button")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mn-account']/a/i")));
        //driver.findElement(By.xpath("//*[@id='mn-account']/a/i")).click();
        //String teste2 = driver.findElement(By.xpath("//*[@id='minhaconta']/li[2]/a/span")).getText();
        //Assert.assertEquals(teste2, "meus cartões");

      //  System.out.println();
     //   try {
            Thread.sleep(8000);
     //   } catch (InterruptedException e) {
    //        e.printStackTrace();
        }

     //   File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //driver.quit();


    private void print() throws IOException {
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File("./print" + cont + ".png"));
        cont++;
    }
}

