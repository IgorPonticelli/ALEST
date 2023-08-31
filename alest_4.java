
import java.util.Arrays;
public class alest_4 {
    public static void main(String[]args){
        int valor1 = 12;
        int valor2 = 1;
        int cont = 2;
        int [] v = new int[10];
        
        System.out.println("Posição: " + valor1 + "\nValor da sequencia na posição desejada: " + fibonacci2(valor1));
        
        fibonacci( cont, v);
        System.out.println("Sequencia Fibonacci até a posição 10: " + Arrays.toString(v));
    }

    public static void fibonacci( int cont, int[] v ){
        v[0] = 1;
        v[1] = 1;
        v[cont] = v[cont-1] + v[cont -2];
        cont++;
        if(cont <10){
            fibonacci(cont, v );
        }
    }

    public static int fibonacci2(int valor1){ // Pega o valor da sequencia de fibonacci que se pede
            if(valor1 <=1){
                return valor1;
            }else{
                return fibonacci2(valor1 -1) + fibonacci2(valor1 -2);
            }
    }

}
