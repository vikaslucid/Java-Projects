import java.util.Scanner;

public class MirrorFormulaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Mirror Formula Calculator ===");
        System.out.println("Mirror formula: 1/f = 1/v - 1/u");
        System.out.print("What do you want to calculate? (f / v / u): ");
        String choice = scanner.next();

        double f = 0, u = 0, v = 0;

        switch (choice.toLowerCase()) {
            case "f":
                System.out.print("Enter image distance (v in cm): ");
                v = scanner.nextDouble();
                System.out.print("Enter object distance (u in cm): ");
                u = scanner.nextDouble();
                f = 1 / ((1 / v) - (1 / u));
                System.out.printf("Calculated focal length (f): %.2f cm\n", f);
                break;

            case "v":
                System.out.print("Enter focal length (f in cm): ");
                f = scanner.nextDouble();
                System.out.print("Enter object distance (u in cm): ");
                u = scanner.nextDouble();
                v = 1 / ((1 / f) - (1 / u));
                System.out.printf("Calculated image distance (v): %.2f cm\n", v);
                break;

            case "u":
                System.out.print("Enter focal length (f in cm): ");
                f = scanner.nextDouble();
                System.out.print("Enter image distance (v in cm): ");
                v = scanner.nextDouble();
                u = 1 / ((1 / v) - (1 / f));
                System.out.printf("Calculated object distance (u): %.2f cm\n", u);
                break;

            default:
                System.out.println("Invalid choice. Please choose f, v, or u.");
                return;
        }

        // Determine mirror type
        String mirrorType = (f > 0) ? "Convex Mirror" : "Concave Mirror";
        System.out.println("Type of Mirror: " + mirrorType);

        // Nature of image
        if ((f < 0 && v > 0) || (f > 0 && v < 0)) {
            System.out.println("Nature of Image: Real and Inverted");
        } else {
            System.out.println("Nature of Image: Virtual and Erect");
        }

        // Position of image
        describeImagePosition(f, u, v);

        scanner.close();
    }

    public static void describeImagePosition(double f, double u, double v) {
        if (f < 0) {  // Concave mirror
            double c = 2 * f;

            // Tolerance for float comparison
            final double epsilon = 0.1;

            if (Math.abs(u - c) < epsilon) {
                System.out.println("Special Case: Object at center of curvature (C) → Image also at C, same size, real and inverted.");
            } else if (Math.abs(u - f) < epsilon) {
                System.out.println("Special Case: Object at focus (F) → Image formed at infinity.");
            } else if (u < f) {
                System.out.println("Object is between pole and focus → Image is virtual, erect, and behind the mirror.");
            } else if (u > f && u < c) {
                System.out.println("Object is between focus and center of curvature → Image is beyond C, real and inverted.");
            } else if (u > c) {
                System.out.println("Object is beyond center of curvature → Image is between F and C, real and inverted.");
            } else if (u < 0 && v < 0) {
                System.out.println("Object is in front of mirror → Image is behind mirror (virtual).");
            } else {
                System.out.println("General Case: Concave mirror image formation.");
            }

        } else {  // Convex mirror
            System.out.println("In a convex mirror, image is always: virtual, erect, and formed between the pole and focus, behind the mirror.");
        }
    }
}
