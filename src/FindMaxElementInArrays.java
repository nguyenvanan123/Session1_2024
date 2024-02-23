import java.util.Scanner;

public class FindMaxElementInArrays {


    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        // Nhập độ dài mảng
        System.out.print ( "Nhập độ dài mảng: " );
        int n = scanner.nextInt ( );

        // Khai báo mảng
        int[] arr = new int[ n ];

        // Nhập từng phần tử
        for (int i = 0; i < n; i++) {
            System.out.print ( "Nhập phần tử thứ " + (i + 1) + ": " );
            arr[ i ] = scanner.nextInt ( );
        }

        // Tìm phần tử lớn nhất
        int max = arr[ 0 ];
        for (int i = 1; i < n; i++) {
            if ( arr[ i ] > max ) {
                max = arr[ i ];
            }
        }

        // In ra kết quả
        System.out.println ( "Phần tử lớn nhất là: " + max );
    }
}




