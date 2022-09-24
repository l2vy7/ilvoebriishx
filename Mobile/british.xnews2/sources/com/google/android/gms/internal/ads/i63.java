package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class i63<E> extends j63<E> {

    /* renamed from: a */
    Object[] f33110a;

    /* renamed from: b */
    int f33111b = 0;

    /* renamed from: c */
    boolean f33112c;

    i63(int i) {
        this.f33110a = new Object[i];
    }

    /* renamed from: e */
    private final void m33089e(int i) {
        Object[] objArr = this.f33110a;
        int length = objArr.length;
        if (length < i) {
            this.f33110a = Arrays.copyOf(objArr, j63.m33558b(length, i));
            this.f33112c = false;
        } else if (this.f33112c) {
            this.f33110a = (Object[]) objArr.clone();
            this.f33112c = false;
        }
    }

    /* renamed from: c */
    public final i63<E> mo32563c(E e) {
        Objects.requireNonNull(e);
        m33089e(this.f33111b + 1);
        Object[] objArr = this.f33110a;
        int i = this.f33111b;
        this.f33111b = i + 1;
        objArr[i] = e;
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable<? extends E>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.j63<E> mo32564d(java.lang.Iterable<? extends E> r3) {
        /*
            r2 = this;
            int r0 = r2.f33111b
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m33089e(r0)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.k63
            if (r0 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r3.next()
            r2.mo19050a(r0)
            goto L_0x0012
        L_0x0020:
            return r2
        L_0x0021:
            com.google.android.gms.internal.ads.k63 r3 = (com.google.android.gms.internal.ads.k63) r3
            java.lang.Object[] r0 = r2.f33110a
            int r1 = r2.f33111b
            int r3 = r3.mo18346a(r0, r1)
            r2.f33111b = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i63.mo32564d(java.lang.Iterable):com.google.android.gms.internal.ads.j63");
    }
}
