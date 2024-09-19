1. Crie um programa java que faça o calculo da área de figuras geometricas ( quadrado, retangulo, triangulo, etc. ). Este projeto deve fazer criar uma interface para o calculo da area da figura geometrica e deve ter varias classes que façam o calculo da area e que implementem a interface. O programa deve ter um menu que mostre as figuras ( quadrado, retangulo, triangulo, losango e fim ). De acordo com a opção, o programa de instanciar um objeto da classe correspondente e chamar o metodo que calcula a area, passando os parametros que forem necessarios e que devem ser informados pelo teclado.

```java
interface AreaCalculavel {
  double calculaArea();
}
```

----

2. Crie uma interface Stack ou "Pilha" genérica que possui o comportamento de LIFO (Last in, First out), último a entrar é o primeiro a sair, com os 3 métodos:

- **push** ou empilhar que recebe um elemento e adiciona na pilha;
- **pop** ou desempilhar que remove e retorna o último elemento adicionado na pilha. Caso a pilha esteja vazia sobe uma exceção;
- **peek** ou espiar, que retorna o último elemento da pilha sem removê-lo. Caso a pilha esteja vazia sobe uma exceção;
- **size** que retorna a quantidade de elementos na pilha;
- **isEmpty** que retorna um booleano indicando se a pilha está vazia ou não.

Implemente essa interface utilizando ArrayList, não vale utilizar a própria Stack do Java rsrs. Faça no seu método main exemplos do uso dos métodos citados.

----

3. Observe a classe abaixo, e refatore para que a mesma possa receber qualquer tipo que herde da classe Number. Utilize generics para esta tarefa.

```java
public class Calculo {

    public Integer numero;
    public Double numeroD;

    public Calculo(Integer numero){
        this.numero = numero;
    }

    public Calculo(Double numeroD){
        this.numeroD = numeroD;
    }

    public Integer quadrado() {
        return this.numero * this.numero;
    }

    public Double quadradoDouble() {
        return this.numeroD * this.numeroD;
    }

}

```

----

4. Crie uma interface Fila genérica que possui o comportamento de FIFO (First in, First out), primeiro a entrar é o primeiro a sair, com os métodos:

- **add** ou adicionar que recebe um elemento e adiciona na fila;
- **peek** ou espiar, que retorna o primeiro elemento da fila sem removê-lo. Caso a fila esteja vazia retorna **null**;
- **poll** recupera e remove o primeiro elemento da fila. Caso a fila esteja vazia retorna **null**;;
- **size** que retorna a quantidade de elementos na fila;
- **isEmpty** que retorna um booleano indicando se a fila está vazia ou não.

Crie a classe FilaImpl que implementa essa interface utilizando ArrayList, não vale utilizar a própria Queue do Java rsrs. Faça no seu método main exemplos do uso dos métodos citados.

----

5. Com base no principio da responsabilidade única, refatore o método da classe BolsaValores e se possível utilize streams:

```java

    public class BolsaValores {

        public BigDecimal calcularPrecoMedioAcoesOrdinarias(List<Acao> acoes) {
            BigDecimal valorTotalOrdinarias = BigDecimal.ZERO;
            Long quantidadeOrdinarias = 0L;
            for(Acao acao : acoes) {
                if(acao.isOrdinaria()) {
                    valorTotalOrdinarias.add(acao.getValor());
                    quantidadeOrdinarias++;
                }
            }

            return valorTotalOrdinarias.divide(new BigDecimal(quantidadeOrdinarias));

        }

    }

    class Acao {

    private String nome;
    private BigDecimal valor;
    private Boolean ordinaria;

    public Boolean isOrdinaria() {
        return ordinaria;
    }

}
  
```