package cadastro.service;

import cadastro.repository.CadastroRepository;

public class CadastroService {

    private CadastroRepository cadastroRepository;

    public void criarUsuario() {
        //RN...

        cadastroRepository.salvarUsuario();

    }

}
