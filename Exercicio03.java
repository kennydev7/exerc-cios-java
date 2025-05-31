public class Exercicio03 {
    public static void main(String[] args) {
        //temperatura celsius
        double temperaturaCelsius = 30.0;

        // conversão para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // impressão com casas decimais
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);

        // casting para valor inteiro (sem casas decimais)

        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;

        // impressão em casas decimais
        System.out.println("Temperatura em Fahrenheit (sem casas decimais): " + temperaturaFahrenheitInteira);

    }
}