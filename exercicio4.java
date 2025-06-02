import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio4 {
    public static void main(String[] args) {

        // média double
        double nota1 = 7.5;
        double nota2 = 9.9;
        double media = (nota1 + nota2 )  / 2;
        System.out.println("Nota Média: " + media);

        // casting de double para int
        double valorDecimal = 8.7;
        int valorInteiro = (int) valorDecimal;
        System.out.println("Valor convertido para inteiro: " + valorInteiro);

        // conectando char e string
        char letra = 'A';
        String palavra = "luno";
        System.out.println("A palavra conectada é : " + letra +palavra);

        //  calculo do valor total do produto
        double valorEmDolares = 21.33;
        double cotacaoDolar = 4;
        double valorEmReais = valorEmDolares * cotacaoDolar;
        System.out.println("Valor em reais: R$ " + valorEmReais);

        // calculo de desconto
        double  precoOriginal = 60.0;
        double percentualDeDesconto = 10.0;
        double valorDesconto = precoOriginal * (precoOriginal / 100);
        System.out.println("O valor do desconto é: " + valorDesconto);





    }
}
