import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle: " + defaultCircle);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius for circle: ");
        double r = sc.nextDouble();

        Circle userCircle = new Circle(r);
        System.out.println("User Circle: " + userCircle);

        sc.close();
    }
}
