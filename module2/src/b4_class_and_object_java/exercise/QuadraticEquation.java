package b4_class_and_object_java.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public double x;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public  QuadraticEquation (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getDiscriminant(){
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double root1 = (-this.b + Math.pow(getDiscriminant(),0.5))/ 2 * this.a;
        return root1;
    }

    public double getRoot2() {
        double root2 = (-this.b - Math.pow(getDiscriminant(),0.5))/ 2 * this.a;
        return root2;
    }
    public String displayResult () {
        if (getDiscriminant() >= 0) {
            return "The equation has two roots " + getRoot1() + " and " + getRoot2();
        } else if (getDiscriminant() == 0) {
            return "The equation has one roots " + getRoot1();
        } else {
            return "The equation has no real roots";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter a, b,c to solve Quadratic Equation");
            System.out.print("Enter a: ");
            double a = input.nextDouble();
            System.out.print("Enter b: ");
            double b = input.nextDouble();
            System.out.print("Enter c: ");
            double c = input.nextDouble();

            QuadraticEquation solve = new QuadraticEquation(a, b, c);
            System.out.println("a = :" + solve.getA());
            System.out.println("b = :" + solve.getB());
            System.out.println("c = :" + solve.getC());
        System.out.println("Reusult" + solve.displayResult());

    }
}
