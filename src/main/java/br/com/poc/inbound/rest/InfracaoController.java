package br.com.poc.inbound.rest;

import br.com.poc.core.usecase.ConsultaInfracaoUC;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
@Path("v1/infracoes")
public class InfracaoController {

    @Inject
    private ConsultaInfracaoUC consultaInfracaoUC;


    @GET
    public Response get(){
        return Response.ok(consultaInfracaoUC.executar()).build();
    }
}
