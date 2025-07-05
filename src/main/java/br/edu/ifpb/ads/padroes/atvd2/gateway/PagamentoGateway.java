package br.edu.ifpb.ads.padroes.atvd2.gateway;

import java.math.BigDecimal;

public interface PagamentoGateway {
    void pagar(BigDecimal valor);
}
