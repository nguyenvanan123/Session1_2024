import java.util.Scanner;

public class DeleteElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Tạo mảng
        int[] arr = new int[n];

        // Nhập các phần tử của mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Nhập vị trí phần tử cần xóa
        System.out.print("Nhập vị trí phần tử cần xóa: ");
        int indexToRemove = scanner.nextInt();

        // Xóa phần tử khỏi mảng
        for (int i = indexToRemove; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // In ra mảng sau khi xóa
        System.out.println("Mảng sau khi xóa:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
