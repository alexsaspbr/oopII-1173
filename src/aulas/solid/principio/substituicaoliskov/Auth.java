package solid.principio.substituicao.liskov;

public class Auth {
    public Boolean checkCredentials(String login, String password) {
        // faz alguma coisa
        return true;
    }
}

class AuthApi extends Auth {

    public Response checkCredentials(String login, String password) {
        // faz alguma coisa
        return new Response(Boolean. true, 200);
    }
}

record Response(Boolean autenticado, Integer statusCode) {
}
