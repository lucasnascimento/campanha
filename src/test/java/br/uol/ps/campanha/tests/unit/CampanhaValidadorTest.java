package br.uol.ps.campanha.tests.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.uol.ps.campanha.Campanha;
import br.uol.ps.campanha.CampanhaValidador;

public class CampanhaValidadorTest {

    CampanhaValidador validador;

    @Before
    public void setUp() {
        validador = new CampanhaValidador();
    }

    @Test
    public void testCampanhaValida() {
        Campanha campanha = new Campanha("Campanha Valida", 15);
        Assert.assertTrue("Uma campanha valida deve retornar true.", validador.valida(campanha));
    }

    @Test
    public void testCampanhaNula() throws Exception {
        Assert.assertFalse("Deve falhar se o objeto é nulo", validador.valida(null));
    }

    @Test
    public void testCampanhaSemNome() {
        Campanha campanha = new Campanha("", 10);
        Assert.assertFalse("O nome da campanha não pode ser vazio.", validador.valida(campanha));
    }

    @Test
    public void testCampanhaPercentualNegativo() {
        Campanha campanha = new Campanha("Campanha Teste", -1);
        Assert.assertFalse("O percentual de desconto da campanha não pode ser menor que zero",
                validador.valida(campanha));
    }

    @Test
    public void testCampanhaPercentualMaiorQue20() {
        Campanha campanha = new Campanha("Campanha Test", 21);
        Assert.assertFalse("O percentual de desconto da campanha não pode ser maior que 20", validador.valida(campanha));
    }

}