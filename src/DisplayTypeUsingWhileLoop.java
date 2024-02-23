public class DisplayTypeUsingWhileLoop {


    public static void main ( String[] args ) {
        // Danh sách các loại hình
        String[] loaiHinh = {"Thể thao", "Âm nhạc", "Nghệ thuật", "Văn học", "Khoa học"};

        // Vòng lặp while để hiển thị từng loại hình
        int i = 0;
        while ( i < loaiHinh.length ) {
            System.out.println ( (i + 1) + ". " + loaiHinh[ i ] );
            i++;
        }
    }
}


