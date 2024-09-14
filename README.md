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