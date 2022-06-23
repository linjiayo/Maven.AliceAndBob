/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your name or input 0 to exit: ");
            String in = sc.nextLine();
            if (in.equals("0")) {
                break;
            }
            if (in.equals("Alice") || in.equals("Bob")) {
                System.out.printf("Hello %s!%n", in);
                break;
            }
            System.out.println("Unrecognized name");
        }
    }
}
