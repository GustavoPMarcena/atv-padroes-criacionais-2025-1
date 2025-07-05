package br.edu.ifpb.ads.padroes.atvd2.gateway;

import java.math.BigDecimal;

public class PaypalGateway implements PagamentoGateway {
    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pagando com paypal, o valor: R$" + valor);
    }
}
