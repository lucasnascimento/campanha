package br.uol.ps.campanha;

public class CampanhaService {

    CampanhaValidador validador = new CampanhaValidador();
    CampanhaDAO dao = new CampanhaDAO();

    public boolean salvar(Campanha campanha) {
        if (validador.valida(campanha)) {
            dao.insert(campanha);
            return true;
        } else {
            return false;
        }
    }

    public void setValidador(final CampanhaValidador validador) {
        this.validador = validador;
    }

    public void setDao(final CampanhaDAO dao) {
        this.dao = dao;
    }
}
