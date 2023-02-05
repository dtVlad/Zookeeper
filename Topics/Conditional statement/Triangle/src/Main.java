import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int aB = a + b;
        int aC = a + c;
        int bC = b + c;
        if (aB > c && aC > b && bC > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}