package Adapters;

import Adaptee.TextView;
import Target.Point;
import Target.Shape;

import java.util.HashMap;
import java.util.Map;

public class TextShapeComposed implements Shape {
    private final TextView textView;

    public TextShapeComposed(Double bottom, Double left, Double width, Double height, String text) {
        this.textView = new TextView(bottom, left, width, height, text);
    }

    @Override
    public Map<String, Point> getBoundingBox() {
        Map<String, Double> origin = this.textView.getOrigin();
        Map<String, Double> extent = this.textView.getExtent();

        double bottom = origin.get("bottom");
        Double left = origin.get("y");
        Double width = extent.get("width");
        Double height = extent.get("height");

        return Map.ofEntries(
                Map.entry("bottomLeft", new Point(bottom, left)),
                Map.entry("topRight", new Point(bottom + height, left + width))
        );
    }

    public boolean isEmpty() {
        return this.textView.isEmpty();
    }
}
