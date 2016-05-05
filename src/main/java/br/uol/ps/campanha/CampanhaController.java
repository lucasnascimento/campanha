package br.uol.ps.campanha;

public class CampanhaController {

    CampanhaService service = new CampanhaService();

    public int salvarCampanha(Campanha campanha) {
        if (service.salvar(campanha)) {
            return 200;
        } else {
            return 400;
        }
    }

    public void setService(final CampanhaService service) {
        this.service = service;
    }
}
