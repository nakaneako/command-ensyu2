import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1人目の身長を入力してください: ");
        double height = sc.nextDouble();
        System.out.print("1人目の体重を入力してください: ");
        double weight = sc.nextDouble();
        double bmi = weight / ((height / 100) * (height / 100));
        System.out.println(String.format("%.2f", bmi));

        System.out.print("2人目の身長を入力してください: ");
        double height2 = sc.nextDouble();
        System.out.print("2人目の体重を入力してください: ");
        double weight2 = sc.nextDouble();
        double bmi2 = weight2 / ((height2 / 100) * (height2 / 100));
        System.out.println(String.format("%.2f", bmi2));

    }
}
