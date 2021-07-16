import java.util.Scanner;
import java.util.ArrayList;

public class Pessoas{
    public static void main(String[] args) throws Exception {
        ArrayList<String> altura = new ArrayList<>();
        ArrayList<String> sexo = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura de cada: ");
        double valores[] = new double[5];
        double maior = valores[0];
        
        for(int i=0;i<5;i++){
            String c = scanner.nextLine();
            altura.add(c);
            valores[i] = Double.parseDouble(c);
            if(valores[i]>maior){
                maior = valores[i];
            }
        }
    
        System.out.println("A altura é: " + altura);
        System.out.println(" ");

        System.out.println("Agora digite o sexo usando F ou M: ");
        
        int contF = 0;
        int contM = 0;
        
        for(int a=0;a<5;a++){
            String b = scanner.nextLine();
            sexo.add(b);
            if(b.equals("F")){
                contF ++;
            }if(b.equals("M")){
                contM ++;
            }
        }
        scanner.close();
        System.out.println("A altura é: " + altura + " o sexo é: " + sexo);
        System.out.println("A quantidade de Homens são: " + contM);
        System.out.println("A quantidade de Mulheres são: " + contF);
        
        for(int i=0;i<5;i++){
            
            if(altura.get(i).compareTo(sexo.get(i))<5){
               if(sexo.get(i).equals("F")){
                System.out.println("A maior pessoa mede: " + maior + " e é do sexo: " + sexo.get(i));
                break;
               }if(sexo.get(i).equals("M")){
                System.out.println("A maior pessoa mede: " + maior + " e é do sexo: " + sexo.get(i));
                break;
                }    
            }
        }
    }
}