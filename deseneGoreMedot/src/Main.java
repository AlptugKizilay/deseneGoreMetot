import java.util.Scanner;

public class Main {


    static int addition(int a, int temp) {
        if (a > temp) {
            return a;
        } else {
            System.out.print(a + "  ");
            return addition(a + 5, temp);
        }


    }

    static int subtraction(int a) {
        if (a <= 0) {
            return a;
        } else {
            System.out.print(a + "  ");
            return subtraction(a - 5);
        }

    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        System.out.print("N sayisi: ");
        a = inp.nextInt();

        addition(subtraction(a), a);


    }
}