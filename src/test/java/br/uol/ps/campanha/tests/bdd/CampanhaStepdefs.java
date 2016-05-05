package br.uol.ps.campanha.tests.bdd;

import org.junit.Assert;

import br.uol.ps.campanha.Campanha;
import br.uol.ps.campanha.CampanhaController;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CampanhaStepdefs {

    Campanha campanha;

    @Quando("^o usuário inserir a capanha \"([^\"]*)\"$")
    public void oUsuarioInserirACapanha(String nomeCampanha) throws Throwable {

        if ("null".equals(nomeCampanha)) {
            nomeCampanha = null;
        }

        campanha = new Campanha(nomeCampanha, 0);
    }

    @E("^com o percentual de desconto de \"([^\"]*)\"$")
    public void comOPercentualDeDescontoDe(Integer percentualDeDesconto) throws Throwable {
        campanha.setPercentualDesconto(percentualDeDesconto);
    }

    @Entao("^a nova campanha o retorno do sistema será \"([^\"]*)\"$")
    public void aNovaCampanhaORetornoDoSistemaSera(Integer retornoEsperado) throws Throwable {
        CampanhaController campanhaController = new CampanhaController();
        Integer retorno = campanhaController.salvarCampanha(campanha);

        Assert.assertEquals("O retorno não foi o esperado", retornoEsperado, retorno);
    }
}
