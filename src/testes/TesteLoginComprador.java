package testes;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PaginaLogin;

import static Utils.Helper.*;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class TesteLoginComprador {


    @Test
    public void TesteLoginComprador() {

        Portais.LogistaComprador();
        PaginaLogin login = new PaginaLogin();
        login.nomeLogin();
        login.senhaLogin();
        login.continuar();
        elementToBeClickable(id("minhaconta"));
        String teste = getText(xpath("//*[@id='content']/div[1]/div/div[1]/div/h1"));
        Assert.assertEquals(teste, "meus dados\n" + "meus cartões\n" + "minhas autorizações");


        // wait.until(ExpectedConditions.elementToBeClickable(By.id("minhaconta")));
        //String teste = driver.findElement(xpath("//*[@id='content']/div[1]/div/div[1]/div/h1")).getText();
        //Assert.assertEquals(teste, "meus dados\n" + "meus cartões\n" + "minhas autorizações");

        //driver.quit();

    }

}
