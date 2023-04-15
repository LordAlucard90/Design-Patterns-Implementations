package sorters;

import java.util.ArrayList;
import java.util.List;

public class QuickSorter implements Sorter {
    @Override
    public <T extends Comparable<T>> List<T> sort(List<T> input) {
        ArrayList<T> result = new ArrayList<>(input);
        for (int i = 0; i < result.size(); i++) {
            boolean flag = false;
            for (int j = 0; j < result.size() - 1; j++) {
                if (result.get(j).compareTo(result.get(j + 1)) > 0) {
                    T k = result.get(j);
                    result.set(j, result.get(j + 1));
                    result.set(j + 1, k);
                    flag = true;
                }
            }
            if (!flag) break;
        }
        return result;
    }

    private <T extends Comparable<T>> void sort(List<T> input, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(input, begin, end);

            sort(input, begin, partitionIndex - 1);
            sort(input, partitionIndex + 1, end);
        }
    }

    private <T extends Comparable<T>> int partition(List<T> input, int begin, int end) {
        T pivot = input.get(end);
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (input.get(j).compareTo(pivot) <= 0) {
                i++;

                T swapTemp = input.get(i);
                input.set(i, input.get(j));
                input.set(j, swapTemp);
            }
        }

        T swapTemp = input.get(i + 1);
        input.set(i + 1, input.get(end));
        input.set(end, swapTemp);

        return i + 1;
    }
}
