import interfaces.Email;

public class Outlook<T> implements Email<T> {
    @Override
    public void enviarMensagem(String mensagem, T anexo) {

    }
}
