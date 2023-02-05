import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int two = 2;
        System.out.println(group1 / two + group2 / two + group3 / two + group1 % two + group2 % two + group3 % two);
    }
}