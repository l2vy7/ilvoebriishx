package com.iab.omid.library.adcolony.adsession;

public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");
    

    /* renamed from: a */
    private final String f21650a;

    private ImpressionType(String str) {
        this.f21650a = str;
    }

    public String toString() {
        return this.f21650a;
    }
}
