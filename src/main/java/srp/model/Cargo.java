package srp.model;

import srp.service.DezOuVintePorCento;
import srp.service.QuinzeOuVintePorCento;
import srp.service.RegraDeCalculo;

public enum Cargo {

    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVintePorCento()),
    TESTER(new QuinzeOuVintePorCento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
