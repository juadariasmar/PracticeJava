import java.util.Scanner; 

public class Ciclo {
    
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        
        long n = numero.nextInt();
        
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
    
}
