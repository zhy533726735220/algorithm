
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {5, 2, 7, 4, 6, 3, 1};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void sort(int a[]){
        int n = a.length - 1;
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < n; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }
            n--;
        }
    }

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
