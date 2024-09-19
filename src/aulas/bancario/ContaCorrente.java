package bancario;

import java.math.BigDecimal;

public class ContaCorrente extends Conta implements Sacavel {

    private static final BigDecimal TAXA_CONTA_CORRENTE = new
            BigDecimal(3.0);

    @Override
    public BigDecimal sacar(BigDecimal valor) {
        return getSaldo().subtract(valor).subtract(TAXA_CONTA_CORRENTE);
    }
}
