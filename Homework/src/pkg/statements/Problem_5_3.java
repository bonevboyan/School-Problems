package pkg.statements;

import pkg.statements.rectangle.Rectangle;

import java.util.Scanner;

public class Problem_5_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("First rectangle upper left x:");
        double firstX1 = scanner.nextDouble();

        System.out.println("First rectangle upper left y:");
        double firstY1 = scanner.nextDouble();

        System.out.println("First rectangle down right x:");
        double firstX2 = scanner.nextDouble();

        System.out.println("First rectangle down right y:");
        double firstY2 = scanner.nextDouble();

        System.out.println("Second rectangle upper left x:");
        double secondX1 = scanner.nextDouble();

        System.out.println("Second rectangle upper left y:");
        double secondY1 = scanner.nextDouble();

        System.out.println("Second rectangle down right x:");
        double secondX2 = scanner.nextDouble();

        System.out.println("Second rectangle down right y:");
        double secondY2 = scanner.nextDouble();

        Rectangle rect1 = new Rectangle(firstX1, firstY1, firstX2, firstY2);

        Rectangle rect2 = new Rectangle(secondX1, secondY1, secondX2, secondY2);

        if (contains(rect1, rect2)) {
            System.out.println("Second rectangle is contained in first rectangle");
        } else if (contains(rect2, rect1)){
            System.out.println("First rectangle is contained in second rectangle");
        } else {
            System.out.println("Neither of the rectangles is contained in the other");
        }

    }
    public static boolean contains(Rectangle rect1, Rectangle rect2)
    {
        if ((rect2.coordinate.x + rect2.width) < (rect1.coordinate.x+rect1.width) &&
            (rect2.coordinate.x) > (rect1.coordinate.x) &&
            (rect2.coordinate.y) < (rect1.coordinate.y) &&
            (rect2.coordinate.y+rect2.height) < (rect1.coordinate.y+rect1.height)){
            return true;
        } else {
            return false;
        }
    }
}
