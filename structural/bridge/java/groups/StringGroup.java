package groups;

import sorters.Sorter;

import java.util.ArrayList;
import java.util.List;

public class StringGroup implements Group<String> {
    private List<String> elements;
    private final Sorter sorter;

    public StringGroup(Sorter sorter) {
        this.elements = new ArrayList<>();
        this.sorter = sorter;
    }

    @Override
    public void sort() {
        elements = sorter.sort(elements);
    }

    @Override
    public void add(String element) {
        elements.add(element);
    }

    @Override
    public String[] getElements() {
        return elements.toArray(new String[]{});
    }
}
