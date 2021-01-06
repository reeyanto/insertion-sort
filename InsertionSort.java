import java.util.Arrays;

public class InsertionSort {

    private static int[] insertion(int[] data) {
        int banyak = data.length;

        for (int i=1; i < banyak; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = {100, 2, 1, 10, 0};
        System.out.println("Sebelum diurutkan: " + Arrays.toString(data));
        System.out.println("Setelah diurutkan: " + Arrays.toString(insertion(data)));
    }
}
