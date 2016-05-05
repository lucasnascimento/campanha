package br.uol.ps.campanha.tests.bdd;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;

public class LoginStepdefs {

    @Dado("^que o usuário esteja logado$")
    public void queOUsuarioEstejaLogado() throws Throwable {
        // TODO: fazer o login com usuário de teste para a fature
    }

    @E("^tenha a permissão a permissão \"([^\"]*)\"$")
    public void tenhaAPermissaoAPermissão(String arg0) throws Throwable {
        // TODO: consultar se este usuário tem a permissão
    }
}
