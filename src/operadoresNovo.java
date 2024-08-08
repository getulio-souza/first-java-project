public class operadoresNovo {
  public static void main(String[] args) {
    boolean var1 = true;
    boolean var2 = false;

    // if (var1 && var2) {
    //   System.out.println("as duas sao verdadeiras");
    // } else {
    //   System.out.println("apenas uma eh verdadeira");
    // }

    if (var1 || var2) {
      System.out.println("uma das condicoes eh verdadeira");
    }
    
    if (var1 && (7 > 4)) {
      System.out.println("as duas condicoes sao verdadeiras");
    }
 }
}
