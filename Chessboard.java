public class Chessboard {
    public static void main(String[] args) {
        int SIZE = 8;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("**");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
