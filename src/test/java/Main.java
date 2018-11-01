import priorityQueue.MaxPQ;

public class Main {
    public static void main(String[] args) {
        MaxPQ<Integer> maxPQ = new MaxPQ<Integer>();
        maxPQ.insert(92);
        maxPQ.insert(55);
        maxPQ.insert(20);
        maxPQ.insert(35);
        maxPQ.insert(37);
        maxPQ.insert(7);
        maxPQ.insert(2);
        maxPQ.insert(5);
        maxPQ.insert(13);
        maxPQ.insert(16);
        maxPQ.insert(19);
        System.out.println(maxPQ.delMax());
        System.out.println(maxPQ.delMax());
        System.out.println(maxPQ.delMax());
    }
}
