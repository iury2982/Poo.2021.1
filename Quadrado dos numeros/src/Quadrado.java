import java.util.Arrays;
import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 numeros: ");
        int[] valores = new int[5];
        int i = 0;
        while(i<5){
            valores[i] = scanner.nextInt();
            i++;
        }
        scanner.close();
        
        System.out.println(" ");

        for(int valor : valores)
        System.out.print(valor + " ");
        System.out.println(" ");
        
        int resultado = 0;
        for(int a = 0; a<valores.length; a++){
            resultado = (valores[a]*valores[a]);
            System.out.print(Arrays.asList(resultado)); 
        }         
    }
}