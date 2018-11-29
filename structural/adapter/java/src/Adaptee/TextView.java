package Adaptee;

import java.util.HashMap;

public class TextView{

    private HashMap<String, Double> origin;
    private HashMap<String, Double> extent;
    private String text;

    public TextView(Double bottom, Double left, Double width, Double height, String text){
        this.origin = new HashMap<String, Double>() {{
            put("bottom", bottom);
            put("y", left);
        }};
        this.extent = new HashMap<String, Double>() {{
            put("width", width);
            put("height", height);
        }};
        this.text = text;
    }

    public HashMap<String, Double> getOrigin() {
        return origin;
    }

    public HashMap<String, Double> getExtent() {
        return extent;
    }

    public boolean isEmpty() {
        return text.equals("");
    }

    public String getText() {
        return text;
    }
}
