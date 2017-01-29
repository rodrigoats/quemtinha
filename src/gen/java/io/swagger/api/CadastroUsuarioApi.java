package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CadastroUsuarioApiService;
import io.swagger.api.factories.CadastroUsuarioApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.ErrorModel;
import io.swagger.model.Usuario;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/cadastroUsuario")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the cadastroUsuario API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-19T23:35:34.275Z")
public class CadastroUsuarioApi  {
   private final CadastroUsuarioApiService delegate = CadastroUsuarioApiServiceFactory.getCadastroUsuarioApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cria uma requisição de cadastro de usuário", response = Usuario.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "usuario response", response = Usuario.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Erro inesperado", response = Usuario.class) })
    public Response addUsuario(@ApiParam(value = "Usuário há ser cadastrado" ,required=true) Usuario usuario
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addUsuario(usuario,securityContext);
    }
}
