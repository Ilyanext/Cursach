import java.time.LocalDate;

public class LocalData {
    public String OneTimeTask() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        String typeTasker = "oднократная задача.";
        return typeTasker;
    }

    public String DailyTask() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        date.plusDays(1);
        String typeTasker = ("задачу следует выполнить до " + dayOfMonth  + "." + month + "." + year);
        return typeTasker;
    }

    public String WeeklyTask() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        date.plusWeeks(1);
        String typeTasker = ("задачу следует выполнить до " + dayOfMonth  + "." + month + "." + year);
        return typeTasker;
    }

    public String MothlyTask() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        date.plusMonths(1);
        String typeTasker = ("задачу следует выполнить до " + dayOfMonth + "." + month + "." + year);
        return typeTasker;
    }

    public String YearlyTask() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        date.plusYears(1);
        String typeTasker = ("задачу следует выполнить до " + dayOfMonth + "." + month + "." + year);
        return typeTasker;
    }
}
