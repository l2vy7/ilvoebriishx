package com.facebook;

/* renamed from: com.facebook.i */
/* compiled from: FacebookDialogException */
public class C3454i extends C3572j {

    /* renamed from: b */
    private int f13003b;

    /* renamed from: c */
    private String f13004c;

    public C3454i(String str, int i, String str2) {
        super(str);
        this.f13003b = i;
        this.f13004c = str2;
    }

    /* renamed from: a */
    public int mo11897a() {
        return this.f13003b;
    }

    /* renamed from: b */
    public String mo11898b() {
        return this.f13004c;
    }

    public final String toString() {
        return "{FacebookDialogException: " + "errorCode: " + mo11897a() + ", message: " + getMessage() + ", url: " + mo11898b() + "}";
    }
}
