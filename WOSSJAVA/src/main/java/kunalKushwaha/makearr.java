package kunalKushwaha;

public class makearr {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2; // remove element 30

        int n = arr.length;

        // shift elements left
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // print array after removal
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
