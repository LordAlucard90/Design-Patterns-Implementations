import Adapters.TextShapeComposed;
import Adapters.TextShapeInherited;
import Target.Point;
import Target.Shape;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Adapter by Inheritance
        Shape inherited = new TextShapeInherited(1., 1., 2.,3., "inherited");

        assert inherited.getBoundingBox().equals(Map.ofEntries(
                Map.entry("bottomLeft", new Point(1., 1.)),
                Map.entry("topRight", new Point(4., 3.))
        ));

        // Adapter by Composition
        Shape composed = new TextShapeComposed(1., 1., 2.,3., "inherited");

        assert composed.getBoundingBox().equals(Map.ofEntries(
                Map.entry("bottomLeft", new Point(1., 1.)),
                Map.entry("topRight", new Point(4., 3.))
        ));
    }
}
