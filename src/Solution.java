import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {


    public static void main(String[] args) {

        System.out.println("Welcome to your Todo Manager!\n");
        System.out.println("Please Enter your Name: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello " + name);

        int choice;

        TreeMap<Integer, String> taskmap = new TreeMap<Integer, String>();

        do {
            //Display the Menu
            System.out.println("Please choose an option\n");
            System.out.println("1. Enter a task ");
            System.out.println("2. Remove a task ");
            System.out.println("3. Update a task ");
            System.out.println("4. List all tasks ");
            System.out.println("5. Exit");
            choice = in.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter number of the task: ");
                    Integer no_of_task = Integer.valueOf(in.nextInt());
                    in.nextLine();
                    System.out.println("Enter the task");
                    String task = in.nextLine();
                    taskmap.put(no_of_task, task);
                    break;
                case 2:
                    System.out.println("Remove a task ");
                    // TODO: implement it
                    break;
                case 3:
                    System.out.println("Update a task ");
                    // TODO: implement it
                    break;
                case 4:
                    System.out.println("List all tasks ");
                    list_all(taskmap);
                    break;
                default:
                    // do nothing
            }
        } while (choice != 5);
    }

    public static void list_all(TreeMap<Integer, String> tm) {
        for (Map.Entry<Integer, String> item : tm.entrySet()) {
            System.out.print(item.getKey());
            System.out.print(" ");
            System.out.println(item.getValue());
        }
    }
}

