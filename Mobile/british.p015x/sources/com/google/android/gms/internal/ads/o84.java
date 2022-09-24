package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o84 {

    /* renamed from: a */
    private final a84[] f36332a = new a84[1];

    /* renamed from: b */
    private int f36333b;

    /* renamed from: c */
    private int f36334c;

    /* renamed from: d */
    private int f36335d = 0;

    /* renamed from: e */
    private a84[] f36336e = new a84[100];

    public o84(boolean z, int i) {
    }

    /* renamed from: a */
    public final synchronized int mo33851a() {
        return this.f36334c * C6540C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    /* renamed from: b */
    public final synchronized a84 mo33852b() {
        a84 a84;
        this.f36334c++;
        int i = this.f36335d;
        if (i > 0) {
            a84[] a84Arr = this.f36336e;
            int i2 = i - 1;
            this.f36335d = i2;
            a84 = a84Arr[i2];
            Objects.requireNonNull(a84);
            a84Arr[i2] = null;
        } else {
            a84 = new a84(new byte[C6540C.DEFAULT_BUFFER_SEGMENT_SIZE], 0);
        }
        return a84;
    }

    /* renamed from: c */
    public final synchronized void mo33853c(a84 a84) {
        a84[] a84Arr = this.f36332a;
        a84Arr[0] = a84;
        mo33854d(a84Arr);
    }

    /* renamed from: d */
    public final synchronized void mo33854d(a84[] a84Arr) {
        int i = this.f36335d;
        int i2 = i + r1;
        a84[] a84Arr2 = this.f36336e;
        int length = a84Arr2.length;
        if (i2 >= length) {
            this.f36336e = (a84[]) Arrays.copyOf(a84Arr2, Math.max(length + length, i2));
        }
        for (a84 a84 : a84Arr) {
            a84[] a84Arr3 = this.f36336e;
            int i3 = this.f36335d;
            this.f36335d = i3 + 1;
            a84Arr3[i3] = a84;
        }
        this.f36334c -= a84Arr.length;
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void mo33855e() {
        mo33856f(0);
    }

    /* renamed from: f */
    public final synchronized void mo33856f(int i) {
        int i2 = this.f36333b;
        this.f36333b = i;
        if (i < i2) {
            mo33857g();
        }
    }

    /* renamed from: g */
    public final synchronized void mo33857g() {
        int max = Math.max(0, d13.m20280K(this.f36333b, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.f36334c);
        int i = this.f36335d;
        if (max < i) {
            Arrays.fill(this.f36336e, max, i, (Object) null);
            this.f36335d = max;
        }
    }
}
