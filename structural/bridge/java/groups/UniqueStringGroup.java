package groups;

import sorters.Sorter;

import java.util.ArrayList;
import java.util.List;

public class UniqueStringGroup implements Group<String> {
    private List<String> elements;
    private final Sorter sorter;

    public UniqueStringGroup(Sorter sorter) {
        this.elements = new ArrayList<>();
        this.sorter = sorter;
    }

    @Override
    public void sort() {
        elements = sorter.sort(elements);
    }

    @Override
    public void add(String element) {
        if (!elements.contains(element)) {
            elements.add(element);
        }
    }

    @Override
    public String[] getElements() {
        return elements.toArray(new String[]{});
    }
}
