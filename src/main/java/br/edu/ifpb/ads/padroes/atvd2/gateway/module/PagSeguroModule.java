package br.edu.ifpb.ads.padroes.atvd2.gateway.module;

import br.edu.ifpb.ads.padroes.atvd2.gateway.PagSeguroGateway;
import br.edu.ifpb.ads.padroes.atvd2.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atvd2.gateway.PaypalGateway;
import com.google.inject.AbstractModule;

public class PagSeguroModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(PagSeguroGateway.class);
    }
}
