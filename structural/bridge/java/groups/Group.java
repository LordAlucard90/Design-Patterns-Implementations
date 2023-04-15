package groups;

import java.util.List;

public interface Group<T> {
    void sort();

    void add(T element);

    T[] getElements();
}
