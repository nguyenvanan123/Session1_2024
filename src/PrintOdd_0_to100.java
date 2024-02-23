public class PrintOdd_0_to100 {
    public static void main ( String[] args ) {
        for (int i = 0; i < 100; i++) {
            if ( i % 2 == 0 ) {
                continue;
            } else {
                System.out.println ( i );
            }
        }
    }
}
