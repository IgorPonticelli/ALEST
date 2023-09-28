package AulasAlest;
import java.util.*;
public class alest{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de n1");
        int n = sc.nextInt(); 

        funcao1(n);
        funcao2(n);
    }
    public static void funcao1(int n){
        double antes = System.currentTimeMillis();
        System.out.println(2*(n*n) + 5*n);
        double depois = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (depois-antes));

    }

    public static void funcao2(int n){
        double antes = System.currentTimeMillis();
        System.out.println(500*n + 4000);
        double depois = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (depois-antes));

    }
}