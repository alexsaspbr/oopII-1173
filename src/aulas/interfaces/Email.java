package interfaces;

public interface Email<T> {

    void enviarMensagem(String mensagem, T anexo);

}
