import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, k, t;
        System.out.print("Sayı Giriniz : ");
        Scanner input = new Scanner(System.in);
        k = input.nextInt();
        System.out.println("Dördün Kuvvetleri : ");
        for (i = 1; i <= k; i *= 4) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        System.out.println("Beşin Kuvvetleri : ");
        for (t = 1; t <= k; t *= 5) {
            System.out.println(t);
        }
    }
}