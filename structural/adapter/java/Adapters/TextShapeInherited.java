package Adapters;

import Adaptee.TextView;
import Target.Point;
import Target.Shape;

import java.util.HashMap;
import java.util.Map;

public class TextShapeInherited extends TextView implements Shape {

    public TextShapeInherited(double bottom, double left, double width, double height, String text) {
        super(bottom, left, width, height, text);
    }

    @Override
    public Map<String, Point> getBoundingBox() {
        Map<String, Double> origin = super.getOrigin();
        Map<String, Double> extent = super.getExtent();

        Double bottom = origin.get("bottom");
        Double left = origin.get("y");
        Double width = extent.get("width");
        Double height = extent.get("height");

        return Map.ofEntries(
                Map.entry("bottomLeft", new Point(bottom, left)),
                Map.entry("topRight", new Point(bottom + height, left + width))
        );
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
}
