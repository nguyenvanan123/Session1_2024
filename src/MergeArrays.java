import java.util.Scanner;

public class MergeArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng thứ nhất
        System.out.print("Nhập số lượng phần tử của mảng thứ nhất: ");
        int n1 = scanner.nextInt();

        // Nhập các phần tử của mảng thứ nhất
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng thứ nhất: ");
            arr1[i] = scanner.nextInt();
        }

        // Nhập số lượng phần tử của mảng thứ hai
        System.out.print("Nhập số lượng phần tử của mảng thứ hai: ");
        int n2 = scanner.nextInt();

        // Nhập các phần tử của mảng thứ hai
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng thứ hai: ");
            arr2[i] = scanner.nextInt();
        }

        // Gộp hai mảng
        int[] arr3 = new int[n1 + n2];

        // Sao chép các phần tử của mảng thứ nhất sang mảng mới
        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }

        // Sao chép các phần tử của mảng thứ hai sang mảng mới
        for (int i = n1; i < n1 + n2; i++) {
            arr3[i] = arr2[i - n1];
        }

        // In ra mảng kết quả
        System.out.println("Mảng kết quả sau khi gộp:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
