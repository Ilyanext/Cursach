public class TaskService {
    private String title;
    private String type;
    private String timeChoice;
    private int id;
    int generId = 0;
    private String description;
    NewData newData = new NewData();

    public TaskService(String title, String description, String type, String timeChoice) {
        this.title = title;
        this.type = type;
        this.id = id++;
        this.description = description;
        this.timeChoice = timeChoice;
    }

    public String getTimeChoice() {
        return timeChoice;
    }

    public String getType() {
        return type;
    }


    public String getTitle() {
        return title;
    }

    public int getGenerId() {
        return generId + id;
    }

    public int getId() {
        return id++;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Название - " + getTitle() + ", описание - " + getDescription() + ", тип задачи: " + getType() + ", создано: " + newData.dataNow() + " " + getTimeChoice();
    }
}
