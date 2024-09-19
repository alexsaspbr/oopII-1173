package cadastro.controller;

import cadastro.service.CadastroService;

public class CadastroController {

    private CadastroService cadastroService;

    public void criarUsuario() {
        cadastroService.criarUsuario();
    } // metodo para a camada de API

}
