package ie.atu.week5;

import java.util.Scanner;

public class ShareApp {
    public static void main(String[] args) {
        System.out.println("Please enter the width of the rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("You entered : " + length);
    }
}
