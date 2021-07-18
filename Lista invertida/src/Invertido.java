import java.util.Scanner;
import java.util.ArrayList;

public class Invertido {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> pessoa = new ArrayList<>();
        System.out.println("Digite o nome de cada pessoa: ");
        System.out.println("Para parar digite .");
        
        while(true){
            String c = scanner.nextLine();
            pessoa.add(c);

            if(c.equals(".")){
                pessoa.remove(".");
                break;
            }
        }
        System.out.println(pessoa);

        System.out.println(" ");

        for(int i=pessoa.size()-1;i>=0;i--){
            System.out.print(pessoa.get(i) + " ");
        }
        scanner.close();
    }
}
