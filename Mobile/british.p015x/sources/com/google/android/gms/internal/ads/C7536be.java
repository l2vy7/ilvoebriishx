package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.be */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7536be extends Exception {
    private C7536be(int i, String str, Throwable th, int i2) {
        super((String) null, th);
    }

    /* renamed from: a */
    public static C7536be m30676a(Exception exc, int i) {
        return new C7536be(1, (String) null, exc, i);
    }

    /* renamed from: b */
    public static C7536be m30677b(IOException iOException) {
        return new C7536be(0, (String) null, iOException, -1);
    }

    /* renamed from: c */
    static C7536be m30678c(RuntimeException runtimeException) {
        return new C7536be(2, (String) null, runtimeException, -1);
    }
}
