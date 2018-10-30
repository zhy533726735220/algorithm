import vector.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.insert(3);
        vector.insert(2);
        vector.insert(4);
        vector.insert(4);
        vector.insert(4);
        vector.insert(6);
        vector.insert(6);
        vector.insert(6);
        vector.insert(8);
//        System.out.println(vector.remove(0, 2));
//        vector.remove(0, 2);
//        vector.deduplicate();
//        System.out.println(vector.find(5));
//        System.err.println(vector.size());
//        vector.deduplicate();
        vector.mergeSort(0, 5);
        Integer a[] = vector.getElem();

        vector.bubbleSort(0, 8);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
//        System.out.println(vector.binSearchC(6, 0, 3));
        System.out.println(vector.size());


    }

}
