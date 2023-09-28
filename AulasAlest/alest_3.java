package AulasAlest;
public class alest_3 {
    public static void main(String[]args){
       int cont = 0;
        recursao1();
        recursao2(cont);
        
    }
    
    public static void recursao1(){
        for(int i =0;i<5;i++){
            System.out.println("Recursao 1 Faaaalaaaaaaa");
        }
    } 

    public static void recursao2(int cont){
        System.out.println("Recursao 2 Faaaalaaaa");
        cont++;
        if(cont <5){
            recursao2(cont);
        }

    }
   
}
