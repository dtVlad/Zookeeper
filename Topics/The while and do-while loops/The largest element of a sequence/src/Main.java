import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int a = 0;
        do{
            n = scanner.nextInt();
            if(a < n){
                a = n;
            }
        } while (n != 0);
        System.out.println(a);
    }
}