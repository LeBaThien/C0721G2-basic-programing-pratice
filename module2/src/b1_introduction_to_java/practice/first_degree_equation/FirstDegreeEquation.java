package _01_introduction_to_java.practice.pt_bac_nhat;
    import java.util.Scanner;
public class FirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println(" Liner Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if(a != 0) {
            double answer = (c - b) / a;
            System.out.printf(" Nghiệm thu được là x = %f!\n", answer);
        }else {
            if ( b == c){
                System.out.println("Vô số nghiệm");
            } else {
                System.out.print("Vô nghiệm!");
            }
        }
        // Sự khác nhau giữa printf, println, và print?


    }
}
