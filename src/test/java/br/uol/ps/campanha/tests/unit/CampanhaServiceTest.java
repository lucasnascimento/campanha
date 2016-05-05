package br.uol.ps.campanha.tests.unit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.uol.ps.campanha.Campanha;
import br.uol.ps.campanha.CampanhaDAO;
import br.uol.ps.campanha.CampanhaService;

@RunWith(MockitoJUnitRunner.class)
public class CampanhaServiceTest {

    @Mock
    CampanhaDAO dao;

    @InjectMocks
    CampanhaService service;

    @Test
    public void testCampanhaInseridoComSucesso() {
        Mockito.doReturn(null).when(dao).insert(Mockito.any(Campanha.class));
        Campanha campanhaParaSalvar = new Campanha("Campanha Test", 10);
        Assert.assertTrue(service.salvar(campanhaParaSalvar));
        Mockito.verify(dao, Mockito.atLeastOnce()).insert(Mockito.any(Campanha.class));
    }

    @Test
    public void testFalhandoNaInsercao() {
        Assert.assertFalse(service.salvar(new Campanha(null, null)));
    }

}
