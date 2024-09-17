import interfaces.Email;

public abstract class Outlook<T> implements Email<T> {
    @Override
    public void enviarMensagem(String mensagem, T anexo) {

    }
}
