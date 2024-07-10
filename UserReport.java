package homework;

public class UserReport {
    private final User user;

    public UserReport(User user) {
        this.user = user;
    }

    public void generateReport() {
        System.out.println("Report for user: " + user.getName());
    }
}

