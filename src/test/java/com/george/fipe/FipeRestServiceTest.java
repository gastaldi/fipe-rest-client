package com.george.fipe;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.george.fipe.client.FipeProvider;
import com.george.fipe.jaxb.Ano;
import com.george.fipe.jaxb.Fipe;
import com.george.fipe.jaxb.Marca;
import com.george.fipe.jaxb.Modelo;
import com.george.fipe.service.FipeRestService;

public class FipeRestServiceTest {

    private FipeRestService service = FipeProvider.getService();

    @Test
    public void testMarcas() throws Exception {
	List<Marca> marcas = service.getMarcas(FipeRestService.REFERER, FipeRestService.CATEGORIA_CARRO);
	assertNotNull(marcas);
	assertFalse(marcas.isEmpty());
    }

    @Test
    public void testModelos() throws Exception {
	List<Modelo> modelos = service.getModelos(FipeRestService.REFERER, FipeRestService.CATEGORIA_CARRO, new Marca("Volvo"));
	assertNotNull(modelos);
	assertFalse(modelos.isEmpty());
    }

    @Test
    public void testAno() throws Exception {
	Ano ano = service.getAno(FipeRestService.REFERER, FipeRestService.CATEGORIA_CARRO, new Modelo("440 Turbo 1.8"));
	assertNotNull(ano);
    }

    @Test
    public void testFipe() throws Exception {
	Fipe tabelaFipe = service.getTabelaFipe(FipeRestService.REFERER, FipeRestService.CATEGORIA_CARRO, new Modelo("440 Turbo 1.8"), "44");
	assertNotNull(tabelaFipe);
    }

}
