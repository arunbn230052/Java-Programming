import java.util.LinkedList;

public class RecentActivities {
    private LinkedList<String> activityList = new LinkedList<>();
    private static final int MAX_SIZE = 5;
    public void addActivity(String activity) {
        if (activityList.size() == MAX_SIZE) {
            activityList.removeFirst();
        }
        activityList.addLast(activity);
    }
    public void viewActivities() {
        System.out.println("Recent Activities:");
        for (String activity : activityList) {
            System.out.println("- " + activity);
        }
    }

    public static void main(String[] args) {
        RecentActivities userActivity = new RecentActivities();

        userActivity.addActivity("Login");
        userActivity.addActivity("Viewed Profile");
        userActivity.addActivity("Edited Settings");
        userActivity.addActivity("Logged out");
        userActivity.addActivity("Logged in again");
        userActivity.addActivity("Changed Password");

        userActivity.viewActivities(); 
    }
}

