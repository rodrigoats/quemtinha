package io.swagger.api.factories;

import io.swagger.api.CadastroReservaApiService;
import io.swagger.api.impl.CadastroReservaApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-19T23:35:34.275Z")
public class CadastroReservaApiServiceFactory {
    private final static CadastroReservaApiService service = new CadastroReservaApiServiceImpl();

    public static CadastroReservaApiService getCadastroReservaApi() {
        return service;
    }
}
