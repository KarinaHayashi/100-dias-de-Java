
/* Para escrever o conteúdo de uma variável com ponto flutuante
System.out.printf("%.2f%n, x);
Em printF o F é a abreviação de formatado e para explicar que ovcê quer duas casas decimais, você voloca "%;2f", na frente
irei colocar o %n o %n é a quebra de linha, por fim você fecha as aspas e coloca uma virgula junto da variável que você quer
imprimir que no nosso caso é a variável x
*/
import java.util.Locale;

public class SaidaDeDados {

    public static void main(String[] args){

        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        //para concatenar vários elementos de um mesmo comando e escrita
        System.out.println ("Resultado = " + x + " metros");
        //para concatenar vários elementos de escrita em um mesmo comando de escrita usando o printf
        // %f ponto futuante %n quebra de linha
        System.out.printf("Resultado = %2f metros%n", x);
        // para concatenar vários elementos de um mesmo comando de escrita
        //%f ponto flutuante %d inteiro %s texto %n qebra de linha
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);



    }
}
