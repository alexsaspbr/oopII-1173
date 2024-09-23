package solid.principio.responsabilidade.unica.service;

import solid.principio.responsabilidade.unica.repository.CadastroRepository;

public class CadastroService {

    private CadastroRepository cadastroRepository;

    public void criarUsuario() {
        //RN...

        cadastroRepository.salvarUsuario();

    }

}
