package br.edu.ifpb.ads.padroes.atvd2.gateway;

import java.math.BigDecimal;

public class StripeGateway implements PagamentoGateway {
    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pagando com Strip, o valor: R$" + valor);
    }
}
