package Adapters;

import Adaptee.TextView;
import Target.Point;
import Target.Shape;

import java.util.HashMap;

public class TextShapeComposed implements Shape {
    private TextView textView;

    public TextShapeComposed(Double bottom, Double left, Double width, Double height, String text) {
        this.textView = new TextView(bottom, left, width, height, text);
    }

    @Override
    public HashMap<String, Point> getBoundingBox() {
        HashMap<String, Double> origin = this.textView.getOrigin();
        HashMap<String, Double> extent = this.textView.getExtent();

        Double bottom = origin.get("bottom");
        Double left = origin.get("left");
        Double width = extent.get("width");
        Double height = extent.get("height");

        return new HashMap<String, Point>(){{
            put("bottomLeft", new Point(bottom, left));
            put("topRight", new Point(bottom + height, left + width));
        }};

    }

    public boolean isEmpty() {
        return this.textView.isEmpty();
    }
}
