import java.text.DecimalFormat;
import java.util.Random;
public class Main {

    static double calcular(int primeiro, int segundo)
    {

        return Math.sqrt(primeiro) * Math.sqrt(segundo); //Retorna a multiplicação da raiz de dois números
    }
    public static void main(String[] args) {

        Random rand = new Random();

        int valor1 = rand.nextInt(11); //Atribui um valor entre 1 e 10
        int valor2 = rand.nextInt(11); //Atribui um valor entre 1 e 10

        DecimalFormat df = new DecimalFormat("0.00"); //Para formatar as casas decimais do valor retornado

        double resultado = calcular(valor1, valor2); //Chamada da função

        System.out.println("Números gerados aleatoriamente: ");
        System.out.println("a = "+valor1);
        System.out.println("b = "+valor2);
        System.out.print("\nResultado da operação: " + df.format(resultado)); //Impressão do resultado na tela com formatação

    }
}