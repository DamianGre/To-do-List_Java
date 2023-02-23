import java.util.*;
public class Main {
    public static void main(String[] args) {
        // To do list app
        System.out.println("Welcome in to do list app!");


        List<String> listToDo = new ArrayList<String>();
        String userOption = "";
        String userTask = "";

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        try
        {
            do
            {
                System.out.println("What you want to do?(to choose enter action number.");
                System.out.println("1. Add task to list");
                System.out.println("2. Print all tasks in list");
                System.out.println("3. Remove task from list");
                System.out.println("Enter \"4\" to close app.");
                System.out.print("Choose action: ");

                userOption = scanner.nextLine();

                switch (userOption)
                {
                    case "1":
                    {
                        System.out.println("Write task to do: ");
                        userTask = scanner2.nextLine();
                        listToDo.add(userTask);
                    }; break;
                    case "2":
                    {
                        int taskNumber = 1;
                        for (int i = 0; i < listToDo.size(); i++)
                        {
                            System.out.println(taskNumber + ". " + listToDo.get(i));
                            taskNumber++;
                        }
                        if (taskNumber == 1) {
                            System.out.println("List is empty!");
                        }
                    }; break;
                    case "3":
                    {
                        System.out.println("\nEnter number of task to remove it from task list.\n");
                        int taskNumber = 1;
                        for (int i = 0; i < listToDo.size(); i++)
                        {
                            System.out.println(taskNumber + ". " + listToDo.get(i));
                            taskNumber++;
                        }
                        if (taskNumber == 1)
                        {
                            System.out.println("List is empty!");
                        }else {
                            System.out.print("Remove: ");
                            int taskToRemove = scanner3.nextInt();
                            listToDo.remove(taskToRemove - 1);
                        }
                    }; break;
                    case "4":  System.out.println("App is closed."); ; break;
                    default:  System.out.println("Wrong data!"); break;
                }
            } while (userOption != "4");
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}