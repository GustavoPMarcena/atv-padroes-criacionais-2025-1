package br.edu.ifpb.ads.padroes.atvd2.gateway;

import java.math.BigDecimal;

public class PagSeguroGateway implements PagamentoGateway {
    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pagando com pag seguro, o valor: R$" + valor);
    }
}
