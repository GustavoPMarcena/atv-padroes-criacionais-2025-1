package br.edu.ifpb.ads.padroes.atvd2;

import br.edu.ifpb.ads.padroes.atvd2.gateway.PagamentoGateway;
import com.google.inject.Inject;

import java.math.BigDecimal;

public class PagamentoService {
    private final PagamentoGateway gateway;

    @Inject
    public PagamentoService(PagamentoGateway gateway) {
        this.gateway = gateway;
    }

    public void pagar(BigDecimal valor) {
        gateway.pagar(valor);
    }
}
