public class Bubble implements Sortable {
    @Override
    public int[] sort(int[] arr) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;

                    swapped = true;
                }
            }
        }
        return arr;
    }
}
