import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro");
            int parameterOne = sc.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parameterTwo = sc.nextInt();



            if (parameterOne >= parameterTwo) {
                throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro!");
            }

            for (int i = 1; i <= parameterTwo - parameterOne; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (InvalidParametersException err) {
            System.out.println(err.getMessage());
        }
    }
}