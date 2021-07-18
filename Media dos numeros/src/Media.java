import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite os numeros");
        System.out.println("Para parar digite -1");

        double soma = 0;
        double Media = 0;
        int div = 0;
        while(true){
            int a = scanner.nextInt();
            if(a == -1)
                break;
            soma += a;
            div ++;
        }
        scanner.close();
        Media = soma/div;
        System.out.println("A media é: " + Media);
    }
}