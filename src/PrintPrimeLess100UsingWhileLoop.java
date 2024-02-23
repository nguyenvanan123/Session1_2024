public class PrintPrimeLess100UsingWhileLoop {


    public static void main ( String[] args ) {
        int i = 2; // Biến để kiểm tra số nguyên tố

        // Vòng lặp while để in các số nguyên tố nhỏ hơn 100
        while ( i < 100 ) {
            if ( isPrime ( i ) ) {
                System.out.println ( i );
            }
            i++;
        }
    }

    // Hàm kiểm tra số nguyên tố
    static boolean isPrime ( int n ) {
        if ( n <= 1 ) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt ( n ); j++) {
            if ( n % j == 0 ) {
                return false;
            }
        }
        return true;
    }
}


