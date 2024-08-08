package edu.getulio.primeirasemana;

public class Operadores {
  public static void main(String[] args) {
    
    // int numero = 5;
    // System.out.println(++numero);
    // System.out.println(numero);

    //invertendo valores com o operador de negacao (!)
    // boolean variavel = true;
    // variavel = !variavel;
    // System.out.println(variavel);

    //operador ternario 

    // int a = 5;
    // int b = 6;
    // String resultado = a == b ? "verdadeiro" : "falso";
    // System.out.println(resultado);

    //comparacoes 
    // int numero1 = 1;
    // int numero2 = 2;

    // // boolean simOuNao = numero1 == numero2;
    // boolean simOuNao = numero1 != numero2;

    // System.out.print(simOuNao);

    // String meuNome = "getulio";
    // String meuNome2 = new String("getulio");

    // //equals eh usado para comparar objetos 
    // System.out.println(meuNome.equals(meuNome2));

    boolean condicao1 = true;
    boolean condicao2 = false;

    if (condicao1 && condicao2) {
      System.out.println("as duas condicoes sao verdadeiras");
    } else {
      System.out.println("apenas uma condicao eh verdadeira");
    }
  }
}
