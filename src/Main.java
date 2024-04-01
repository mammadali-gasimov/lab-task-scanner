import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int secondInput = scanner.nextInt();
//        String msg = input % 2 == 0 ? "Cutdu" : "Tekdi";
//        System.out.println(msg);

        int[] array = {15, 250, 23, 457, 456, 321, 875, 246, 190, 234, 800, 9837, 12351};
        int digitSum = 0;
        for (int num : array) {
            if (num >= input && num <= secondInput) {
                int temp = num;
                while (temp > 0) {
                    digitSum += temp % 10;
                    temp /= 10;
                }
                if (digitSum > 7) {
                    System.out.println(num);
                }
                digitSum = 0;
            }
        }
    }
}