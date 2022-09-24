package com.iab.omid.library.startio.adsession.media;

/* compiled from: Sta */
public enum InteractionType {
    CLICK("click");
    
    public String interactionType;

    /* access modifiers changed from: public */
    InteractionType(String str) {
        this.interactionType = str;
    }

    public String toString() {
        return this.interactionType;
    }
}
