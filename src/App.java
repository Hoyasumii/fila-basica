import com.queue.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new Queue<Integer>(1, 2, 3, 4, 5);
        queue.show();
        System.out.println("Head: " + queue.getFirstItem() + "; Tail: " + queue.getLastItem());
        queue.enqueue(6);
        queue.show();
        System.out.println("Head: " + queue.getFirstItem() + "; Tail: " + queue.getLastItem());
        queue.dequeue();
        queue.show();
        System.out.println("Head: " + queue.getFirstItem() + "; Tail: " + queue.getLastItem());
        System.out.println(queue.contains(30));

    }
}
