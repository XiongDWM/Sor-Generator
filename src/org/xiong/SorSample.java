package org.xiong;

public record SorSample(
    int[] curve, 
    String eventComment
    ) {

    public int[] getCurve() {
        return curve;
    }

    public String getEventComment() {
        return eventComment;
    }
} 
