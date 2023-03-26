import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task task = new Task();
        int i = 0;
        while (true) {
            try {
                System.out.println("\nВыберите пункт из меню.");
                System.out.println("1. Добавить задачу.\n" + "2. Удалить задачу. \n" + "3. Показать весь список задач. \n" + "4. Выйти из программы. ");
                int vvod = scanner.nextInt();
                repit:
                switch (vvod) {
                    case (1):
                        i++;
                        task.addTask(i);
                        break repit;
                    case (2):
                        task.removeTask();
                        break repit;
                    case (3):
                        task.printTask();
                        break repit;
                    case (4):
                        System.exit(0);
                    default:
                        System.out.println("Неправильно ввели данные. Попробуйте еще!");
                        break repit;
                }
            } catch (InputMismatchException e) {
                System.out.println("Неправильный формат данных!");// рекурсия
            }
        }
    }
}