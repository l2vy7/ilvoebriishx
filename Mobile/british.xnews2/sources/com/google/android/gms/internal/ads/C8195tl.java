package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.tl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8195tl {
    /* renamed from: a */
    public static int m37896a(int i, int i2, int i3) {
        if (i >= 0 && i < i3) {
            return 0;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public static String m37897b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static void m37898c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static void m37899d(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: e */
    public static void m37900e(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public static void m37901f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }
}
