package bancario;

import java.math.BigDecimal;

public class CaixaEletronico {

    public void sacar(Sacavel conta, BigDecimal valor) {
        conta.sacar(valor);
    }

}
