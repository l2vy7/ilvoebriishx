package com.iab.omid.library.startio.adsession;

/* compiled from: Sta */
public enum Owner {
    NATIVE("native"),
    NONE("none");
    
    private final String owner;

    /* access modifiers changed from: public */
    Owner(String str) {
        this.owner = str;
    }

    public String toString() {
        return this.owner;
    }
}
