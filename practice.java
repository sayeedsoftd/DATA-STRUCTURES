package MyJavaProject.helloword;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int steps = calculateSteps(x);

        System.out.println("Minimum steps needed: " + steps);

    }
    private static int calculateSteps(int x) {
        if (x <= 5) {
            return 1;
        }

        int steps = 0;
        while (x > 5) {
            if (x % 5 == 0) {
                steps += x / 5;
                x = 0;
            } else {
                x -= 4;
                steps++;
            }
        }

        if (x > 0) {
            steps++;
        }

        return steps;
    }
}
