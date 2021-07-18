import java.util.Scanner;
import java.util.Arrays;

public class MaiorMenor{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 valores: ");
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

        int maior = valores[0];
        int menor = valores[0];
        
        for(int indice=0;indice<valores.length;indice++){
            if(valores[indice]<menor){
                menor = valores[indice];
            }if(valores[indice]>maior){
                maior = valores[indice];
            }
        }    
        System.out.println(" ");

        for(int a=0;a<valores.length;a++){
            if(valores[a]==maior){
                System.out.println(Arrays.asList(valores[a]) + " É o maior valor");
            }if(valores[a]==menor){
                System.out.println(Arrays.asList(valores[a]) + " É o menor valor");
            }if(valores[a]>menor && valores[a]<maior){
                System.out.println(Arrays.asList(valores[a]));
            }
        }
    }    
}
