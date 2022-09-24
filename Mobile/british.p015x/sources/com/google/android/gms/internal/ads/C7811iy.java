package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.iy */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C7811iy extends IOException {

    /* renamed from: b */
    public final boolean f33552b;

    /* renamed from: c */
    public final int f33553c;

    protected C7811iy(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f33552b = z;
        this.f33553c = i;
    }

    /* renamed from: a */
    public static C7811iy m33482a(String str, Throwable th) {
        return new C7811iy(str, th, true, 1);
    }

    /* renamed from: b */
    public static C7811iy m33483b(String str, Throwable th) {
        return new C7811iy(str, th, true, 0);
    }

    /* renamed from: c */
    public static C7811iy m33484c(String str) {
        return new C7811iy(str, (Throwable) null, false, 1);
    }
}
