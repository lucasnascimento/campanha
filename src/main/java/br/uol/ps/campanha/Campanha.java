package br.uol.ps.campanha;

public class Campanha {

    private String nomeCampanha;
    private Integer percentualDesconto;

    public Campanha() {

    }

    public Campanha(final String nomeCampanha, final Integer percentualDesconto) {
        this.nomeCampanha = nomeCampanha;
        this.percentualDesconto = percentualDesconto;
    }

    public String getNomeCampanha() {
        return nomeCampanha;
    }

    public void setNomeCampanha(final String nomeCampanha) {
        this.nomeCampanha = nomeCampanha;
    }

    public Integer getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(final Integer percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        final Campanha campanha = (Campanha) o;

        if (nomeCampanha != null ? !nomeCampanha.equals(campanha.nomeCampanha) : campanha.nomeCampanha != null)
            return false;
        return percentualDesconto != null ? percentualDesconto.equals(campanha.percentualDesconto)
                : campanha.percentualDesconto == null;

    }

    @Override
    public int hashCode() {
        int result = nomeCampanha != null ? nomeCampanha.hashCode() : 0;
        result = 31 * result + (percentualDesconto != null ? percentualDesconto.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder()//
                .append("Campanha [")//
                .append("nomeCampanha=\"")//
                .append(nomeCampanha).append("\"")//
                .append(",percentualDesconto=\"")//
                .append(percentualDesconto).append("\"")//
                .append("]");
        return builder.toString();
    }

}
