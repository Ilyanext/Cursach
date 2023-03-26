import java.time.LocalDate;

public class NewData {
    public String dataNow() {
        LocalDate date = LocalDate.now(); // получаем текущую дату
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();

        return dayOfMonth + "." + month + "." + year;
    }

    public static String choiceTime(int time) {
        LocalData choiceTime = new LocalData();
        while (true) {
            repit:
            switch (time) {
                case (1):
                    return choiceTime.OneTimeTask();
                case (2):
                    return choiceTime.DailyTask();
                case (3):
                    return choiceTime.WeeklyTask();
                case (4):
                    return choiceTime.MothlyTask();
                case (5):
                    return choiceTime.YearlyTask();
                default:
                    System.out.println("Непраильно ввели данные!");
                    break repit;
            }

        }
    }
}




