import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerTitle = new Scanner(System.in);
        Scanner scannerDescription = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nВыберите пункт из меню.");
                System.out.println("1. Добавить задачу.\n" + "2. Удалить задачу. \n" + "3. Показать весь список задач. \n" + "4. Выйти из программы. ");
                int vvod = scanner.nextInt();
                repit:
                switch (vvod) {
                    case (1):
                        System.out.println("Назваание задачи");
                        String title = scannerTitle.nextLine();

                        System.out.println("Описание");
                        String description = scannerDescription.nextLine();

                        Task task = new Task(title, description);
                        ArrayList<TaskService> list = new ArrayList<>();
                        list.add(task);
                        System.out.println(list);
                        break repit;
                    case (2):
                        System.out.println("2");
                        break;
                    case (3):
                        System.out.println("3");
                        break;
                    case (4):
                        System.exit(0);
                    default:
                        System.out.println("Неправильно ввели данные. Попробуйте еще!");
                        break repit;
                }
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Неправильный формат данных!");
            }

        }
    }
}