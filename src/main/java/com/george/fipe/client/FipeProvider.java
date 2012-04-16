package com.george.fipe.client;

import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

import com.george.fipe.service.FipeRestService;

public class FipeProvider {

    static {
	RegisterBuiltin.register(ResteasyProviderFactory.getInstance());
    }

    public static FipeRestService getService() {
	return ProxyFactory.create(FipeRestService.class, "http://tabela.carros.uol.com.br/");
    }

}
