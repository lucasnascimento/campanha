package br.uol.ps.campanha;

public class CampanhaValidador {

    public boolean valida(Campanha campanha) {
        if (campanha == null) {
            return false;
        }
        if (campanha.getNomeCampanha() == null) {
            return false;
        }
        if (campanha.getNomeCampanha().length() <= 3) {
            return false;
        }
        if (0 > campanha.getPercentualDesconto() || 20 < campanha.getPercentualDesconto()) {
            return false;
        }
        return true;
    }
}
