import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.print("Num1: ");
        int num1 = sc1.nextInt();

        System.out.print("Num2: ");
        int num2 = sc1.nextInt();

        ArrayList<Integer> primos = new ArrayList<>();

        boolean primo = true;

        for (int i = num1; i <= num2; i++) {
            primo = true;
            for(int l = num1+1; l < num2; l++) {
                if(i != l) {
                    if(i % l == 0) {
                        primo = false;
                    }
                }
            }
            if(primo == true) {
                primos.add(i);
            }
        }

        System.out.println(primos);

    }
}