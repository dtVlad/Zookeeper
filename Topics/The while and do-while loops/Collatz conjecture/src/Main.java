import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 2;
        int b = 3;
        int c = 1;
        System.out.print(n + " ");
        while(n != 1) {
            if (n % 2 == 0) {
                n = n / a;
                System.out.print(n + " ");
            } else if (n % 2 != 0) {
                n = n * b + c;
                System.out.print(n + " ");
            }
        }
    }
}