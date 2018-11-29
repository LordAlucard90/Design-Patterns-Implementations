import Adapters.TextShapeComposed;
import Adapters.TextShapeInherited;
import Target.Point;
import Target.Shape;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Adapter by Inheritance
        Shape inherited = new TextShapeInherited(1., 1., 2.,3., "inherited");

        assert inherited.getBoundingBox().equals(new HashMap<String, Point>(){{
            put("bottomLeft", new Point(1., 1.));
            put("topRight", new Point(4., 3.));
        }});


        // Adapter by Composition
        Shape composed = new TextShapeComposed(1., 1., 2.,3., "inherited");

        assert composed.getBoundingBox().equals(new HashMap<String, Point>(){{
            put("bottomLeft", new Point(1., 1.));
            put("topRight", new Point(4., 3.));
        }});
    }
}
