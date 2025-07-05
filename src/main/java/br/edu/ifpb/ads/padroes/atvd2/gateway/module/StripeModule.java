package br.edu.ifpb.ads.padroes.atvd2.gateway.module;

import br.edu.ifpb.ads.padroes.atvd2.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atvd2.gateway.StripeGateway;
import com.google.inject.AbstractModule;

public class StripeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(StripeGateway.class);
    }
}
