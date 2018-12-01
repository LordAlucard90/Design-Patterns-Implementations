package Adaptee;

import java.util.Map;

public class TextView{

    private Map<String, Double> origin;
    private Map<String, Double> extent;
    private String text;

    public TextView(Double bottom, Double left, Double width, Double height, String text){
        this.origin = Map.ofEntries(Map.entry("bottom", bottom), Map.entry("y", left));
        this.extent = Map.ofEntries(Map.entry("width", width), Map.entry("height", height));
        this.text = text;
    }

    public Map<String, Double> getOrigin() {
        return origin;
    }

    public Map<String, Double> getExtent() {
        return extent;
    }

    public boolean isEmpty() {
        return text.equals("");
    }

    public String getText() {
        return text;
    }
}
