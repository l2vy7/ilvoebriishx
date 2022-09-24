package com.iab.omid.library.startio.adsession;

/* compiled from: Sta */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");
    
    private final String typeString;

    /* access modifiers changed from: public */
    AdSessionContextType(String str) {
        this.typeString = str;
    }

    public String toString() {
        return this.typeString;
    }
}
