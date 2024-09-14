package interfaces;

//JPA
public interface Persistence <I, V> {

 /* E - Element (usado exclusivamente pelo Java Collections Framework)
    K - Key
    N - Number
    T - Type
    V - Value
    S,U,V etc. - 2nd, 3rd, 4th types*/

    void save(I identificador, V valor);

    V buscar(String nome);

}
