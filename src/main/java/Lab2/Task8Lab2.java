package Lab2;

public class Task8Lab2 {
    public static void drawInvertedStars(int rows){
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int rows=10;
        drawInvertedStars(rows);
    }
}
