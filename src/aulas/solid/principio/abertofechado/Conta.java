package solid.principio.aberto.fechado;

import java.math.BigDecimal;

public class Conta {

    protected BigDecimal saldo;

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
