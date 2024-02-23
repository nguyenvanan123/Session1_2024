import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số từ bàn phím
        System.out.print("Nhập số giới hạn: ");
        int n = scanner.nextInt();

        // In ra các số nguyên tố từ 2 đến n
        System.out.println("Các số nguyên tố từ 2 đến " + n + " là:");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            // Duyệt từ 2 đến căn bậc hai của i
            for (int j = 2; j <= Math.sqrt(i); j++) {
                // Nếu i chia hết cho j, không phải là số nguyên tố
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // In ra số nguyên tố
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
