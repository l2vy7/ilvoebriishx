package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7392h {

    /* renamed from: a */
    private final String f29320a;

    /* renamed from: b */
    private final String f29321b;

    public C7392h(String str) {
        this(str, (String) null);
    }

    public C7392h(String str, String str2) {
        C4604n.m20099l(str, "log tag cannot be null");
        C4604n.m20090c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f29320a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f29321b = null;
        } else {
            this.f29321b = str2;
        }
    }
}
