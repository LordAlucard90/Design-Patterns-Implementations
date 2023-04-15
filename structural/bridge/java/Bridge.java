import groups.StringGroup;
import groups.UniqueStringGroup;
import sorters.BubbleSorter;
import sorters.QuickSorter;

import java.util.Arrays;
import java.util.List;

public class Bridge {

    public static void main(String[] args) {
        StringGroup stringGroupBubbleSorted = new StringGroup(new BubbleSorter());
        stringGroupBubbleSorted.add("C");
        stringGroupBubbleSorted.add("B");
        stringGroupBubbleSorted.add("C");
        stringGroupBubbleSorted.add("A");
        stringGroupBubbleSorted.sort();
        assert  Arrays.asList(stringGroupBubbleSorted.getElements()).equals(List.of("A", "B", "C", "C"));

        UniqueStringGroup uniqueStringGroupBubbleSorted = new UniqueStringGroup(new BubbleSorter());
        uniqueStringGroupBubbleSorted.add("C");
        uniqueStringGroupBubbleSorted.add("B");
        uniqueStringGroupBubbleSorted.add("C");
        uniqueStringGroupBubbleSorted.add("A");
        uniqueStringGroupBubbleSorted.sort();
        assert Arrays.asList(uniqueStringGroupBubbleSorted.getElements()).equals(List.of("A", "B", "C"));

        StringGroup stringGroupQuickSorted = new StringGroup(new QuickSorter());
        stringGroupQuickSorted.add("C");
        stringGroupQuickSorted.add("B");
        stringGroupQuickSorted.add("C");
        stringGroupQuickSorted.add("A");
        stringGroupQuickSorted.sort();
        assert Arrays.asList(stringGroupQuickSorted.getElements()).equals(List.of("A", "B", "C", "C"));

        UniqueStringGroup uniqueStringGroupQuickSorted = new UniqueStringGroup(new QuickSorter());
        uniqueStringGroupQuickSorted.add("C");
        uniqueStringGroupQuickSorted.add("B");
        uniqueStringGroupQuickSorted.add("C");
        uniqueStringGroupQuickSorted.add("A");
        uniqueStringGroupQuickSorted.sort();
        assert Arrays.asList(uniqueStringGroupQuickSorted.getElements()).equals(List.of("A", "B", "C"));
    }
}
