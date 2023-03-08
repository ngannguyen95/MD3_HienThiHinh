public class Main {
    public static void main(String[] args) {
        // hình chữ nhật
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //tam giác vuông đáy dưới
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
//         tam giác vuông đáy trên
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
//        System.out.print("*");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j > i ; j--) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //tam giác cân
        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 1; j--) {
                System.out.print(" "); // in ra các khoảng trống
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* "); // in ra các dấu *
            }
            System.out.println(); // xuống dòng

        }

    }
}