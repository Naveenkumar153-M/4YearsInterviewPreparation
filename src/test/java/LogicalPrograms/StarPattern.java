package LogicalPrograms;

public class StarPattern {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Right Angle Triangle");
        rightAngleTriangle(rows);
        System.out.println("Left Angle Triangle");
        leftAngleTriangle(rows);
        System.out.println("Pyramid Triangle");
        pyramidTriangle(rows);

    }

    public static void leftAngleTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pyramidTriangle(int rows) {
        for (int i = 0; i < rows; i++) {

            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
