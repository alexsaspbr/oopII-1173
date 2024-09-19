package bancario;

import java.math.BigDecimal;

public class ContaSalario extends Conta implements Sacavel {

    @Override
    public BigDecimal sacar(BigDecimal valor) {
        return getSaldo().subtract(valor);
    }
}