import com.queue.Queue;
import com.queue.resources.ScannerImproved;

public class App {
    public static void main(String[] args) throws Exception, ArrayIndexOutOfBoundsException {

        boolean running = true;
        Queue<Integer> queue = new Queue<Integer>();

        while (running) {

            String[] options = {"Show items", "Insert item", "Drop item", "Clear", "Close"};

            System.out.println("[1] Head: " + queue.getFirstItem() + "; Tail: " + queue.getLastItem() + "; Length: " + queue.count);
            System.out.println("- What do you want to do?");

            for (int index = 0; index < options.length; index++) {
                System.out.println("\t[" + (index + 1) + "] " + options[index]);
            }

            int optionMenu = ScannerImproved.nextInt("$ ");

            switch (optionMenu) {
                case 1 -> {
                    System.out.print("[1] Items: ");
                    queue.show();
                }
                case 2 -> {
                    int newItem = ScannerImproved.nextInt("[2] Choose the number to add: ");
                    queue.enqueue(newItem);
                    System.out.println("[2] " + newItem + " has been successfully added!");
                }
                case 3 -> {
                    Integer oldItem = queue.dequeue();
                    System.out.println("[3] " + (
                            (oldItem == null) ? "The stack could not remove the item because the stack is empty" : oldItem + " has been successfully removed from the stack!")
                    );
                }
                case 4 -> {
                    int oldSize = queue.count;
                    queue.clear();
                    System.out.println("[4] " + oldSize + " items have been removed from the queue!");
                }
                case 5 -> running = false;
                default -> {
                }
            }

            for (int index = 0; index < 100; index++) System.out.print('-');
            System.out.println();
        }
    }
}
