import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите имя: ");
            String name = sc.nextLine();

            if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }
        }

    }
}