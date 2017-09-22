package testes;

import Utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.PaginaRecuperacaoSenha;

public class RecuperarSenha {

    @Test
    public void RecuperacaoSenha() {
        WebDriver driver = WebDriverFactory.GetChromeDriver();
        Portais.RecuperacaoSenha();
        PaginaRecuperacaoSenha recuperasenha = new PaginaRecuperacaoSenha();
        recuperasenha.email();
        //recuperasenha.continuar();


        driver.quit();


    }
}
