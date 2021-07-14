import java.util.Scanner;
import java.util.Arrays;

public class Idade{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade do vetor: ");
        int acc = 0;
        int limitador = 0;
        while(true){
            int a = scanner.nextInt();
            if(a <= 0)
                break;
            limitador ++;
            acc += a;
            if(limitador==1){
                break;
            }
        }

        System.out.println("Digite a idade de cada: ");
        int[] valores = new int[acc];
        int i = 0;
        while(i<acc){
            valores[i] = scanner.nextInt();
            i++;
        }
        scanner.close();

        System.out.println(" ");

        for(int valor : valores)
        System.out.print(valor + " ");
        System.out.println(" ");
        
        int menor = 0;
        int maior = 0;
        for(int indice=0;indice<valores.length;indice++){
            if(valores[indice]<18){
                menor ++;
            }if(valores[indice]>=18){
                maior ++;
            }
        }    
        System.out.println(" ");

        System.out.println(Arrays.asList("Somente " + maior + " é de maior"));
        System.out.println(Arrays.asList(menor + " é de menor"));
        
    }    
}
