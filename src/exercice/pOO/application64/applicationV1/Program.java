package src.exercice.pOO.application64.applicationV1;
import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double xA,xB,xC,yA,yB,yC;
        System.out.println("Enter the measures triangle x: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measures triangle y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA+xB+xC)/2;
        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

         p = (yA+yB+yC)/2;
        double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

        System.out.printf("The area of the triangle is: %.4f", areaX);
        System.out.printf("\nThe area of the triangle is: %.4f", areaY);

        if (areaX > areaY) {
            System.out.println("\nLarger area: X");
        }else {
            System.out.println("\nLarger area: Y");
        }

        sc.close();
    }
}
