import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        //import Scanner
        Scanner sc = new Scanner(System.in);

        // Enter the 6 numbers what user want
        System.out.println("--The first three entries will correspond to the coordinates of 3-dimensional point P1--");
        System.out.println("Enter the x-coordinate of point 1: ");
        double x1= sc.nextDouble();
        System.out.println("Enter the y-coordinate of point 1: ");
        double y1= sc.nextDouble();
        System.out.println("Enter the z-coordinate of point 1: ");
        double z1= sc.nextDouble();
        System.out.println("-- the second 3 entries will correspond the the coordinates of a second 3-dimensional point P2");
        System.out.println("Enter the x-coordinate of point 2: ");
        double x2= sc.nextDouble();
        System.out.println("Enter the y-coordinate of point 2: ");
        double y2= sc.nextDouble();
        System.out.println("Enter the z-coordinate of point 2: ");
        double z2= sc.nextDouble();

        //count with a given number

        //square each xyz first
        double mathPowx = Math.pow((x1-x2),2);
        double mathPowy = Math.pow((y1-y2),2);
        double mathPowz = Math.pow((z1-z2),2);

        //Put the root of the number in front.
        double distanceBetween1andw2  = Math.sqrt(mathPowx+mathPowy+mathPowz);

        System.out.println("The distance between point 1 and point 2 is: "+distanceBetween1andw2);
        System.out.println( );
        //Bonus! print Integer part of the distance and Fractional part of the distance
        System.out.println("The integer part of the distance between point 1 and 2 is: "+(int)distanceBetween1andw2);
        System.out.println("The fractional part of the distance between point 1 and 2 is: "+(distanceBetween1andw2-(int)distanceBetween1andw2));




    }
}
