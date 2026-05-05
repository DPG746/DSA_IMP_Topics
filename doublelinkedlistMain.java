import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList list = new MyLinkedList();

        System.out.println("Enter number of operations:");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Choose operation:");
            System.out.println("1: addAtHead");
            System.out.println("2: addAtTail");
            System.out.println("3: addAtIndex");
            System.out.println("4: deleteAtIndex");
            System.out.println("5: get");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int val1 = sc.nextInt();
                    list.addAtHead(val1);
                    break;

                case 2:
                    int val2 = sc.nextInt();
                    list.addAtTail(val2);
                    break;

                case 3:
                    int index3 = sc.nextInt();
                    int val3 = sc.nextInt();
                    list.addAtIndex(index3, val3);
                    break;

                case 4:
                    int index4 = sc.nextInt();
                    list.deleteAtIndex(index4);
                    break;

                case 5:
                    int index5 = sc.nextInt();
                    System.out.println(list.get(index5));
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}