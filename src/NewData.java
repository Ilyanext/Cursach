import java.time.LocalDate;

public class NewData {
    public LocalDate dataNow() {
        LocalDate date = LocalDate.now(); // получаем текущую дату
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();

        return date;
    }

    public static String choiceTime() {
        LocalData choiceTime = new LocalData();
        while (true) {
            repit:
            switch (Main.enterInt()) {
                case (1):
                    return choiceTime.oneTimeTask();
                case (2):
                    return choiceTime.dailyTask();
                case (3):
                    return choiceTime.weeklyTask();
                case (4):
                    return choiceTime.mothlyTask();
                case (5):
                    return choiceTime.yearlyTask();
                default:
                    System.out.println("Попробуйте еще!");
                    break repit;
            }

        }
    }
}




