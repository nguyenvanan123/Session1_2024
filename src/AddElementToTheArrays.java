import java.util.Scanner;

public class AddElementToTheArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

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

        // Nhập phần tử mới
        System.out.print("Nhập phần tử mới muốn thêm: ");
        int newElement = scanner.nextInt();

        // Thêm phần tử mới vào cuối mảng
        arr[arr.length - 1] = newElement;

        // In ra mảng sau khi thêm
        System.out.println("Mảng sau khi thêm:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
