
public class MinhaClasse {
    //isso representa um metodo
    public static void main(String[] args) {
        // int meu_Numero = 11;
        // final String BR = "Brasil";
        // String meuNome = "Getulio";
        // int anoDeFabricacao = 2022;
        // boolean portaAberta = true;
        // boolean portaFechada = false;
        String primeiroNome = "Getulio";
        String segundoNome = "Souza";

        //a variavel que criei "nomeCompletoFinal" recebe a chamda do metodo "nomeCompleto"
        String nomeCompletoFinal = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompletoFinal);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "resultado da concatenacao: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
