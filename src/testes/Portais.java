package testes;

import Utils.Helper;

public class Portais {
    public static void LogistaComprador() {
        Helper.get("http://10.59.164.13/portal/#/");
    }

    public static void RecuperacaoSenha() {
        Helper.get("http://10.59.164.13/portal/#/forgot-password");
    }


}
