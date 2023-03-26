public class Type {
    public static String choiceType(int number) {
        while (true) {
            switch (number) {
                case (1):
                    return "рабочая";
                case (2):
                    return "личная";
                default:
                    System.out.println("Неправильно ввели данные!");
            }
        }
    }
}
