import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static List<String> workList = new ArrayList<>();

    public static void main(String[] args) {
        boolean b = true;
        while (b) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2: {
                    outPut();
                    break;
                }
                case 3: {
                    delete();
                    break;
                }
                case 0: {
                    b = false;
                    break;
                }
                default: {
                    System.out.println("выберите действие");
                    break;
                }
            }
        }
    }


    private static void addTask() {
        System.out.println("Добавьте заметку");
        String addToList = in.next();
        workList.add(addToList);

    }

    private static void outPut() {
        for (int i = 0; i < workList.size(); i++) {
            System.out.println(i + 1 + ". " + workList.get(i));

        }
        System.out.println();
        System.out.println();
    }

    private static void delete() {
        for (int i = 0; i < workList.size(); i++) {
            System.out.println(i + 1 + ". " + workList.get(i));
        }
        System.out.println("Какую задачу хотите удалить? \n" +
                "Выберите номер задачи");
        int deleteList = in.nextInt();
        workList.remove(deleteList - 1);
    }

}
