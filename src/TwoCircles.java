import java.util.Scanner;

public class TwoCircles {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        // Circle r1
        System.out.println(
                "Enter the radius and coordinates of the first circle R1 (x,y): "
        );
        System.out.print(
                "r1x: "
        );
        double r1x = input.nextDouble();

        System.out.print(
                "r1y: "
        );
        double r1y = input.nextDouble();

        System.out.print(
                "Radius: "
        );
        double radiusR1 = input.nextDouble();

        // circle r2
        System.out.println(
                "Enter the coordinates (x,y) of the second circle R2"
        );
        System.out.print(
                "r2x: "
        );
        double r2x = input.nextDouble();
        System.out.print(
                "ry2: "
        );
        double r2y = input.nextDouble();

        System.out.print(
                "Radius: "
                );
        double radiusR2 = input.nextDouble();

        // Essential calculations
            // Distance between circle centers
        double centerDistance = Math.sqrt(Math.pow((r1x - r2x),2)+Math.pow((r1y-r2y),2));
        System.out.println(centerDistance);

            // Substraction Difference between radii
        double radiiDifferenceSubtraction = radiusR1 - radiusR2;

            // Addition difference between radii
        double radiiDifferenceAddition = radiusR1 + radiusR2;

        // Setting up the path determination of result

        if (centerDistance <= radiiDifferenceAddition)   {
            if (centerDistance <= radiiDifferenceSubtraction)
                System.out.print(
                        "Circle R2 is inside Circle R1"
                );
            else
                System.out.print(
                        "Circle R2 is overlapping circle R1"
                );
        }
        else
            System.out.print(
                    "The circles are beyond each others perimeters and thus do not touch"
            );


    }
}
