public class Merging {

    public static void main(String[] args) {
        new Merging().runApp();
    }

    void runApp() {

        int[] a = {1, 6, 11, 12};
        int[] b = {3, 5, 7, 9, 10};
        int[] c = mergeSortedArry(a, b);
        printArray(c);
    }

    int[] mergeSortedArry(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];

            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];

        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;
    }

    void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
