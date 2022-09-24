package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.cast.s0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
class C8724s0<E> extends C8740t0<E> {

    /* renamed from: a */
    Object[] f43967a = new Object[4];

    /* renamed from: b */
    int f43968b = 0;

    /* renamed from: c */
    boolean f43969c;

    C8724s0(int i) {
    }

    /* renamed from: b */
    private final void m41299b(int i) {
        Object[] objArr = this.f43967a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f43967a = Arrays.copyOf(objArr, i2);
            this.f43969c = false;
        } else if (this.f43969c) {
            this.f43967a = (Object[]) objArr.clone();
            this.f43969c = false;
        }
    }

    /* renamed from: a */
    public final C8724s0<E> mo36726a(E e) {
        Objects.requireNonNull(e);
        m41299b(this.f43968b + 1);
        Object[] objArr = this.f43967a;
        int i = this.f43968b;
        this.f43968b = i + 1;
        objArr[i] = e;
        return this;
    }
}
