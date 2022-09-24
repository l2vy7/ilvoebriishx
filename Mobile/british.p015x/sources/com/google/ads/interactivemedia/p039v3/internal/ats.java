package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ats */
/* compiled from: IMASDK */
public class ats<E> {

    /* renamed from: a */
    Object[] f15734a;

    /* renamed from: b */
    int f15735b;

    /* renamed from: c */
    boolean f15736c;

    ats() {
    }

    ats(byte[] bArr) {
        this();
        aup.m14884o(4, "initialCapacity");
        this.f15734a = new Object[4];
        this.f15735b = 0;
    }

    /* renamed from: a */
    static int m14789a(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    /* renamed from: c */
    private void m14790c(int i) {
        Object[] objArr = this.f15734a;
        int length = objArr.length;
        if (length < i) {
            this.f15734a = Arrays.copyOf(objArr, m14789a(length, i));
            this.f15736c = false;
        } else if (this.f15736c) {
            this.f15734a = (Object[]) objArr.clone();
            this.f15736c = false;
        }
    }

    /* renamed from: b */
    public void mo14494b(Object obj) {
        ars.m14627g(obj);
        m14790c(this.f15735b + 1);
        Object[] objArr = this.f15734a;
        int i = this.f15735b;
        this.f15735b = i + 1;
        objArr[i] = obj;
    }
}
