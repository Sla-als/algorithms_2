import java.util.Arrays;

public class Java implements Sortable {

    @Override
    public int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
