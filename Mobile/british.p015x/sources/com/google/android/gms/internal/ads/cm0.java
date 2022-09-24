package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cm0 {

    /* renamed from: d */
    public static final cm0 f30416d = new cm0(new ck0[0]);

    /* renamed from: e */
    public static final wx3<cm0> f30417e = cl0.f30409a;

    /* renamed from: a */
    public final int f30418a;

    /* renamed from: b */
    private final ck0[] f30419b;

    /* renamed from: c */
    private int f30420c;

    public cm0(ck0... ck0Arr) {
        this.f30419b = ck0Arr;
        this.f30418a = ck0Arr.length;
    }

    /* renamed from: a */
    public final int mo30957a(ck0 ck0) {
        for (int i = 0; i < this.f30418a; i++) {
            if (this.f30419b[i] == ck0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final ck0 mo30958b(int i) {
        return this.f30419b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cm0.class == obj.getClass()) {
            cm0 cm0 = (cm0) obj;
            return this.f30418a == cm0.f30418a && Arrays.equals(this.f30419b, cm0.f30419b);
        }
    }

    public final int hashCode() {
        int i = this.f30420c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f30419b);
        this.f30420c = hashCode;
        return hashCode;
    }
}
