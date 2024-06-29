package com.example.Graddle;

import java.util.ArrayList;

public class StylesResponse {

    private int total_count;
    private ArrayList<Style> styles;

    public StylesResponse(int total_count, ArrayList<Style> styles) {
        this.total_count = total_count;
        this.styles = styles;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public ArrayList<Style> getStyles() {
        return styles;
    }

    public void setStyles(ArrayList<Style> styles) {
        this.styles = styles;
    }
}
