import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task {
    Map<Integer, TaskService> task = new HashMap<>();

    public void addTask(int numberTask) {
        Scanner scannerTitle = new Scanner(System.in);
        Scanner scannerDescription = new Scanner(System.in);
        Scanner scannerType = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        NewData newData = new NewData();

        System.out.println("Название задачи: ");
        String title = scannerTitle.nextLine();

        System.out.println("Описание: ");
        String description = scannerDescription.nextLine();

        System.out.println("Выберите тип задачи: ");
        System.out.println("1. Рабочая \n" + "2. Личная");
        int numberType = scannerType.nextInt();
        String type = Type.choiceType(numberType);

        System.out.println("\nВыберите повторяемость задачи:");
        System.out.println("1. Однократная.\n" + "2. Ежедневная. \n" + "3. Еженедельная. \n" + "4. Ежемесячная. \n" + "5. Ежегодная.");
        int time = scanner.nextInt();
        String timeChoice = NewData.choiceTime(time);


        task.put(numberTask, new TaskService(title, description, type, timeChoice));


    }

    public void removeTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Под каким номером задачу хотите удалить?");
        int numberTask = scanner.nextInt();
        task.remove(numberTask);
    }

    public void printTask() {
        for (Map.Entry<Integer, TaskService> number : task.entrySet()) {
            System.out.println("Задача №" + number.getKey() + ". " + number.getValue());
        }
    }
}

