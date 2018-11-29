package Adapters;

import Adaptee.TextView;
import Target.Point;
import Target.Shape;

import java.util.HashMap;

public class TextShapeInherited extends TextView implements Shape {

    public TextShapeInherited(double bottom, double left, double width, double height, String text) {
        super(bottom, left, width, height, text);
    }

    @Override
    public HashMap<String, Point> getBoundingBox() {
        HashMap<String, Double> origin = super.getOrigin();
        HashMap<String, Double> extent = super.getExtent();

        Double bottom = origin.get("bottom");
        Double left = origin.get("left");
        Double width = extent.get("width");
        Double height = extent.get("height");

        return new HashMap<String, Point>(){{
            put("bottomLeft", new Point(bottom, left));
            put("topRight", new Point(bottom + height, left + width));
        }};

    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
}
