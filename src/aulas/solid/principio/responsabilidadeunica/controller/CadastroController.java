package solid.principio.responsabilidade.unica.controller;

import solid.principio.responsabilidade.unica.service.CadastroService;

public class CadastroController {

    private CadastroService cadastroService;

    public void criarUsuario() {
        cadastroService.criarUsuario();
    } // metodo para a camada de API

}
