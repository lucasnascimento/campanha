package br.uol.ps.campanha;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class CampanhaService {

    CampanhaDAO dao = new CampanhaDAO();

    public boolean salvar(Campanha campanha) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validador = factory.getValidator();
        Set<ConstraintViolation<Campanha>> violacoes = validador.validate(campanha);

        if (violacoes.size() == 0) {
            dao.insert(campanha);
            return true;
        } else {
            return false;
        }
    }

    public void setDao(final CampanhaDAO dao) {
        this.dao = dao;
    }
}
