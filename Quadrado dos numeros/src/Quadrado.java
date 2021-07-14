import java.util.Arrays;

public class Quadrado {
    public static void main(String[] args) throws Exception {
        int[] valores = new int[5];
        valores[0] = 5;
        valores[1] = 3;
        valores[2] = 2;
        valores[3] = 6;
        valores[4] = 8;

        for(int valor : valores)
        System.out.print(valor + " ");
        System.out.println("");
        
        int resultado = 0;
        for(int i = 0; i<valores.length; i++){
            resultado = (valores[i]*valores[i]);
            System.out.print(Arrays.asList(resultado)); 
        }         
    }
}
