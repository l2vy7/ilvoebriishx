package com.facebook.internal;

import android.graphics.Bitmap;

/* renamed from: com.facebook.internal.s */
/* compiled from: ImageResponse */
public class C3552s {

    /* renamed from: a */
    private C3548r f13262a;

    /* renamed from: b */
    private Exception f13263b;

    /* renamed from: c */
    private boolean f13264c;

    /* renamed from: d */
    private Bitmap f13265d;

    C3552s(C3548r rVar, Exception exc, boolean z, Bitmap bitmap) {
        this.f13262a = rVar;
        this.f13263b = exc;
        this.f13265d = bitmap;
        this.f13264c = z;
    }

    /* renamed from: a */
    public Bitmap mo12070a() {
        return this.f13265d;
    }

    /* renamed from: b */
    public Exception mo12071b() {
        return this.f13263b;
    }

    /* renamed from: c */
    public C3548r mo12072c() {
        return this.f13262a;
    }

    /* renamed from: d */
    public boolean mo12073d() {
        return this.f13264c;
    }
}
