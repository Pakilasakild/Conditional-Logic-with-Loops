import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        I am once again lazy, for me it's easier to use arrays, sorri.
         */
        Scanner sc = new Scanner(System.in);
        int evens = 0;
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Even numbers: ");
        for (int i = 0; i < 10; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i]);
                evens++;
            }
            if (i != 9 && nums[i] % 2 == 0) {
                System.out.print(", ");
            }
        }
        System.out.print(" Number of even numbers: " + evens);
    }
}