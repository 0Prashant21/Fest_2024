import java.util.Arrays;
import java.util.Comparator;

public class Greedy_ActivitySelection {

    // Function to perform activity selection using a greedy approach
    public static void activitySelection(int[] start, int[] end, int n) {
        // Create an array of activities
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }

        // Sort activities by their finishing times (end time)
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        System.out.println("Selected activities:");

        // The first activity is always selected
        int lastEndTime = activities[0][1];
        System.out.println("Activity: Start = " + activities[0][0] + ", End = " + activities[0][1]);

        // Consider the rest of the activities
        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= lastEndTime) {
                // Select the activity if its start time is greater than or equal to the last activity's end time
                System.out.println("Activity: Start = " + activities[i][0] + ", End = " + activities[i][1]);
                lastEndTime = activities[i][1];
            }
        }
    }

    public static void main(String[] args) {
        // Start and end times of the activities
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int n = start.length;

        // Perform activity selection
        activitySelection(start, end, n);
    }
}
