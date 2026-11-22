import java.util.Scanner;

public class acp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current gear (1-5): ");
        int gear = scanner.nextInt();

        System.out.print("Are the brakes applied? (true/false): ");
        boolean brakesApplied = scanner.nextBoolean();

        int speed = 0;

        switch (gear) {
            case 1:
                speed = 20;
                break;
            case 2:
                speed = 40;
                break;
            case 3:
                speed = 60;
                break;
            case 4:
                speed = 80;
                break;
            case 5:
                speed = 100;
                break;
            default:
                System.out.println("Invalid gear!");
                return;
        }

        if (brakesApplied) {
            speed -= 20;
            if (speed < 0) {
                speed = 0;
            }
        }

        System.out.println("Current Speed: " + speed + " km/h");

        scanner.close();
    }
}