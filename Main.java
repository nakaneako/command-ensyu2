import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("身長を入力してください: ");
        double height = scanner.nextDouble();

        System.out.print("体重を入力してください: ");
        double weight = scanner.nextDouble();

        double bmi = weight / ((height / 100) * (height / 100));

        System.out.println(String.format("%.2f", bmi));
    }
}
