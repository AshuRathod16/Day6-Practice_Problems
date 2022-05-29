import java.util.Scanner;

public class TempConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fehrenheit temprature :");
        double temp = scanner.nextDouble();

        System.out.println("Celsius temprature is = "+celsius(temp));


    }

    private static double celsius(double f) {
        return (f-32)*5/9;
    }

}



