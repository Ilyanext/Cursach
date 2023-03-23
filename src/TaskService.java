public class TaskService {
    private String title;
    //private Type type;
    private int id;
    private String description;

    public TaskService(String title,  String description) {
        this.title = title;
//        this.type = type;
        this.id=++id;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Type getType() {
//        return type;
//    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Задача #" + getId() +
                " название - " + getTitle() +
                ", описание - " + getDescription();
    }
}
