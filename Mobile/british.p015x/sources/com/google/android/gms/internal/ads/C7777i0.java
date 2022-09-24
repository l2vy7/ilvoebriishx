package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7777i0 extends C7850k0 {

    /* renamed from: b */
    public final long f33005b;

    /* renamed from: c */
    public final List<C7814j0> f33006c = new ArrayList();

    /* renamed from: d */
    public final List<C7777i0> f33007d = new ArrayList();

    public C7777i0(int i, long j) {
        super(i);
        this.f33005b = j;
    }

    /* renamed from: c */
    public final C7777i0 mo32507c(int i) {
        int size = this.f33007d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7777i0 i0Var = this.f33007d.get(i2);
            if (i0Var.f34088a == i) {
                return i0Var;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C7814j0 mo32508d(int i) {
        int size = this.f33006c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7814j0 j0Var = this.f33006c.get(i2);
            if (j0Var.f34088a == i) {
                return j0Var;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo32509e(C7777i0 i0Var) {
        this.f33007d.add(i0Var);
    }

    /* renamed from: f */
    public final void mo32510f(C7814j0 j0Var) {
        this.f33006c.add(j0Var);
    }

    public final String toString() {
        String b = C7850k0.m33805b(this.f34088a);
        String arrays = Arrays.toString(this.f33006c.toArray());
        String arrays2 = Arrays.toString(this.f33007d.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(b.length() + 22 + length + String.valueOf(arrays2).length());
        sb.append(b);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
