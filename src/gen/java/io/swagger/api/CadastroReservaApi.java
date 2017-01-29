package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CadastroReservaApiService;
import io.swagger.api.factories.CadastroReservaApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.ErrorModel;
import io.swagger.model.Reserva;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/cadastroReserva")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the cadastroReserva API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-19T23:35:34.275Z")
public class CadastroReservaApi  {
   private final CadastroReservaApiService delegate = CadastroReservaApiServiceFactory.getCadastroReservaApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cria uma requisição de cadastro de reserva", response = Reserva.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "reserva response", response = Reserva.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Erro inesperado", response = Reserva.class) })
    public Response addReserva(@ApiParam(value = "Reserva há ser cadastrado" ,required=true) Reserva reserva
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addReserva(reserva,securityContext);
    }
}
