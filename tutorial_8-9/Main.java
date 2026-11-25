import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== LOADING SAVED TASKS =====");
        loadTasksFromFile(tasks);
        
        System.out.println("\n===== ADD TASKS =====");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Task " + i + ": ");
            String task = scanner.nextLine();
            tasks.add(task);
        }

        System.out.println("\n===== TASK LIST =====");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        saveTasksToFile(tasks);
        scanner.close();
    }

    public static void saveTasksToFile(ArrayList<String> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("task.txt"))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
            System.out.println("\nTasks saved successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void loadTasksFromFile(ArrayList<String> tasks) {
        try (BufferedReader reader = new BufferedReader(new FileReader("task.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }
            System.out.println("----- TASKS LOADED FROM FILE -----");
            for (String task : tasks) {
                System.out.println(task);
            }
        } catch (IOException e) {
            System.out.println("No saved tasks found. Starting fresh.");
        }
    }
}
