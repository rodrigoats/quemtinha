package io.swagger.api.factories;

import io.swagger.api.CadastroUsuarioApiService;
import io.swagger.api.impl.CadastroUsuarioApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-19T23:35:34.275Z")
public class CadastroUsuarioApiServiceFactory {
    private final static CadastroUsuarioApiService service = new CadastroUsuarioApiServiceImpl();

    public static CadastroUsuarioApiService getCadastroUsuarioApi() {
        return service;
    }
}
