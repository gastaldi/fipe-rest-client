package com.george.fipe.uol.service;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.george.fipe.uol.jaxb.Ano;
import com.george.fipe.uol.jaxb.Fipe;
import com.george.fipe.uol.jaxb.Marca;
import com.george.fipe.uol.jaxb.Modelo;

@Path("/app/client")
public interface FipeRestService {

    public static final String REFERER = "http://carros.uol.com.br/fipe/";

    public static final int CATEGORIA_CARRO = 1;
    public static final int CATEGORIA_MOTO = 2;
    public static final int CATEGORIA_CAMINHAO = 3;

    @POST
    @Path("/pgListMarcas.do")
    @Produces(MediaType.APPLICATION_XML)
    public List<Marca> getMarcas(@HeaderParam("Referer") @DefaultValue(REFERER) String referer,
	    @QueryParam("category") @DefaultValue("1") int categoria);

    @POST
    @Path("/pgListModels.do")
    @Produces(MediaType.APPLICATION_XML)
    public List<Modelo> getModelos(@HeaderParam("Referer") @DefaultValue(REFERER) String referer,
	    @QueryParam("category") @DefaultValue("1") int categoria, @QueryParam("marca") Marca marca);

    @POST
    @Path("/pgListYear.do")
    @Produces(MediaType.APPLICATION_XML)
    public Ano getAno(@HeaderParam("Referer") @DefaultValue(REFERER) String referer, @QueryParam("category") @DefaultValue("1") int categoria,
	    @QueryParam("modelo") Modelo modelo);

    @POST
    @Path("/pgListPrize.do")
    @Produces(MediaType.APPLICATION_XML)
    public Fipe getTabelaFipe(@HeaderParam("Referer") @DefaultValue(REFERER) String referer,
	    @QueryParam("category") @DefaultValue("1") int categoria, @QueryParam("modelo") Modelo modelo, @QueryParam("celula") String celulaAno);

}
