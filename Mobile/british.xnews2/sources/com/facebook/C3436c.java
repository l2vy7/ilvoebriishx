package com.facebook;

/* renamed from: com.facebook.c */
/* compiled from: AccessTokenSource */
public enum C3436c {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true);
    

    /* renamed from: b */
    private final boolean f12945b;

    private C3436c(boolean z) {
        this.f12945b = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo11872d() {
        return this.f12945b;
    }
}
