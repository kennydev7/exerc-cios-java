//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o  Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 9.1;
        //Média calculada pelas 3 notas do joão, gabriel e renan
        System.out.println("Nota do filme: " + notaDoFilme);
        double notaMedia = 6.3 + 7.7 + 6.2 / 3.0;
        System.out.println(notaMedia);
        String sinopse;
        sinopse = """
         Filme Top Gun
         Filme de aventura com galã dos anos 80
         Muito bom!
         Ano de lançamento
         """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (notaMedia /2);
        System.out.println(classificacao);


    }
}