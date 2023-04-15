package sorters;

import java.util.ArrayList;
import java.util.List;

public class BubbleSorter implements Sorter {
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
}
