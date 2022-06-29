public class Main {
    public static void main(String[] args) {

        Point point1 = new Point();
        Point point2 = new Point(20,5);

        System.out.print("The distance from " + point1.toString() + "to " + point2.toString() + "is: " );
        System.out.println(point2.toString());
        System.out.println();

        point1.setPoint(1,4);
        System.out.println("P1 new coordinates are: ");
        System.out.println("x = " + point1.getValueX());
        System.out.println("y = " + point1.getValueY());

        point2.setPoint(2,3);
        System.out.println("P2 new coordinates are: ");
        System.out.println("x = " + point2.getValueY());
        System.out.println("y = " + point2.getValueY());

        System.out.print("The distance from " + point1.toString() + " to " + point2.toString() + " is: ");
        System.out.println(point1.distance(point2));
    }




}