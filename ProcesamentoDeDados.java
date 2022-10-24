//Processamento de ados é feito por comando de atribuição:
// Sintaxe: <variável> = <expressão>
// o sinal "=" se lê: recebe
//a Regra do comando é simples: a expressão que estiver do lado direito vai ser calculada
// e depois o resultado dessa expressão é armazenada na variável que estiver ao lado esquerdo
public class ProcesamentoDeDados {
    public static void main(String[] args){
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h= 5.0;
        double resultado;

        area = (b + B) / 2.0 *h;

        System.out.println(area);

        resultado = (double) B / b;

        System.out.println(resultado);

        /* BOA PRÁTICA: você sempre indica o tipo do número que você esta usando double .0 float f
        mesmo que o número não tiver nenhum valor de casa decimais você coloca o
        .0 só para indicar que ele é um número double
         */


    }
}
