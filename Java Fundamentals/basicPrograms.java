import java.util.Scanner;

public class basicPrograms {

    Scanner sc = new Scanner(System.in);

    // 1. Welcome Message
    public void welcome() {
        System.out.println("Welcome to Bridgelabz!");
    }

    // 2. Add Two Numbers
    public void addTwoNumbers() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Sum = " + (num1 + num2));
    }

    // 3. Celsius to Fahrenheit
    public void celsiusToFahrenheit() {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    // 4. Area of a Circle
    public void areaOfCircle() {
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // 5. Volume of a Cylinder
    public void volumeOfCylinder() {
        System.out.print("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }

    // 6. Simple Interest
    public void simpleInterest() {
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = sc.nextDouble();
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + si);
    }

    // 7. Perimeter of a Rectangle
    public void perimeterOfRectangle() {
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }

    // 8. Power Calculation
    public void powerCalculation() {
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to " + exponent + " = " + result);
    }

    // 9. Average of Three Numbers
    public void averageOfThree() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + avg);
    }

    // 10. Kilometers to Miles
    public void kilometersToMiles() {
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println(km + " kilometers is equal to " + miles + " miles.");
    }

    // Main method to test
    public static void main(String[] args) {
        basicPrograms obj = new basicPrograms();
        
        // Example calls
        obj.welcome();
        obj.addTwoNumbers();
        obj.celsiusToFahrenheit();
        obj.areaOfCircle();
        obj.volumeOfCylinder();
        obj.simpleInterest();
        obj.perimeterOfRectangle();
        obj.powerCalculation();
        obj.averageOfThree();
        obj.kilometersToMiles();
    }
}
