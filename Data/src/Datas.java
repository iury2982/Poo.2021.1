import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Datas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();

        System.out.println("Digite a data solicitada: ");
        
        Date ValorData = data.parse(scanner.next());
        cal.setTime(ValorData);

        scanner.close();

        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH);
        int ano = cal.get(Calendar.YEAR);

        System.out.println(" ");

        System.out.println("A data é: " + data.format(ValorData));

        System.out.println(" ");
        
        System.out.println("dia: " + dia);
        System.out.println("Mes: " + (mes+1));
        System.out.println("Ano: " + ano);
    }
}
