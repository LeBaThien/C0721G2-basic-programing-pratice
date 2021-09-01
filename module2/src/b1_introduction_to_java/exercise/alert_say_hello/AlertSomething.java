package b1_introduction_to_java.exercise.alert_say_hello;

import java.util.Scanner;
public class AlertSomething {
    public static void main(String[] args) {
        System.out.println("Input your something");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(" Hello + " + name);
    }
}
