package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b63 extends e63 {
    b63() {
        super((d63) null);
    }

    /* renamed from: j */
    static final e63 m30612j(int i) {
        return i < 0 ? e63.f31243b : i > 0 ? e63.f31244c : e63.f31242a;
    }

    /* renamed from: a */
    public final int mo30624a() {
        return 0;
    }

    /* renamed from: b */
    public final e63 mo30625b(int i, int i2) {
        return m30612j(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    /* renamed from: c */
    public final <T> e63 mo30626c(T t, T t2, Comparator<T> comparator) {
        return m30612j(comparator.compare(t, t2));
    }

    /* renamed from: d */
    public final e63 mo30627d(boolean z, boolean z2) {
        return m30612j(x83.m39400a(z, z2));
    }

    /* renamed from: e */
    public final e63 mo30628e(boolean z, boolean z2) {
        return m30612j(x83.m39400a(false, false));
    }
}
