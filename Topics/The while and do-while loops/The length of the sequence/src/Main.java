import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        while(n != 0){
            a++;
            n = scanner.nextInt();
        }
        System.out.println(a);
    }
}
