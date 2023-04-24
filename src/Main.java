import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        Integer result = number1 * number2;
        Integer userAnswer;

        System.out.println("Le résultat de " + number1 + " x " + number2 + " est ?");

        Scanner scan = new Scanner(System.in);

        try {
            userAnswer = scan.nextInt();
            if (result.equals(userAnswer)) {
                System.out.println("Bien joué tu as trouvé la bonne réponse.");
            } else {
                System.out.println("Pas bien joué, tu es nul !");
            }
            main(args);
        } catch (InputMismatchException exception) {
            System.exit(0);
        }
    }
}