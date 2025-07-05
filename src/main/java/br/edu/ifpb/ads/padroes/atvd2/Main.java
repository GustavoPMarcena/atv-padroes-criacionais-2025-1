package br.edu.ifpb.ads.padroes.atvd2;

import br.edu.ifpb.ads.padroes.atvd2.gateway.module.GatewayModule;
import br.edu.ifpb.ads.padroes.atvd2.gateway.module.StripeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
// PayPal
        Injector injectorPayPal = Guice.createInjector(new GatewayModule());
        PagamentoService servicePayPal = injectorPayPal.getInstance(PagamentoService.class);
        servicePayPal.pagar(BigDecimal.valueOf(100));

        // Stripe
        Injector injectorStripe = Guice.createInjector(new StripeModule());
        PagamentoService serviceStripe = injectorStripe.getInstance(PagamentoService.class);
        serviceStripe.pagar(BigDecimal.valueOf(200));
    }
}
