public class Main {
    public static void main(String args[]) {
        int coordinateA1 = 10;
        int coordinateB1 = 16;
        int coordinateA2 = 16;
        int coordinateB2 = 24;


        if ( coordinateA1 < coordinateB1 && coordinateA2 < coordinateB2 ) {



            if ( coordinateA1 >= coordinateA2 && coordinateA1 < coordinateB2 ) {
                if (coordinateB1 <= coordinateB2) {
                    System.out.print("Пересечение [" + coordinateA1 + "," + coordinateB1 + "]");
                } else {
                    System.out.print("Пересечение [" + coordinateA1 + "," + coordinateB2 + "]");
                }

            } else if ( coordinateB1 > coordinateA2 && coordinateB1 <= coordinateB2 ) {
                System.out.print("Пересечение [" + coordinateA2 + "," + coordinateB1 + "]");

            } else if ( coordinateA2 < coordinateB1 && coordinateA2 >= coordinateA1 ) {

                if ( coordinateB2 <= coordinateB1 ) {
                    System.out.print("Пересечение [" + coordinateA2 + "," + coordinateB2 + "]");
                } else {
                    System.out.print("Пересечение [" + coordinateA2 + "," + coordinateB1 + "]");
                }

            } else if (coordinateB2 > coordinateA1 && coordinateB2 <= coordinateB1) {
                System.out.print("Пересечение [" + coordinateA2 + "," + coordinateB1 + "]");

            } else if (coordinateA1 == coordinateB2) {
                System.out.print("Пересечение в точке [" + coordinateA2 + "]");
            } else if (coordinateB1 == coordinateA2) {
                System.out.print("Пересечение в точке [" + coordinateA2 + "]");

            } else {
                System.out.print("Пересечения нет");
            }
        } else {
            System.out.print("Не коректно заданы координаты отрезков");
        }
    }
}