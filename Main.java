package homework;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Persister persister = new UserPersister(user);
        UserReport report = new UserReport(user);

        persister.save();
        report.generateReport();
    }
}
