package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fb4 {

    /* renamed from: a */
    private final SparseBooleanArray f31698a;

    /* synthetic */ fb4(SparseBooleanArray sparseBooleanArray, ea4 ea4) {
        this.f31698a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int mo31797a(int i) {
        nu1.m20742a(i, 0, this.f31698a.size());
        return this.f31698a.keyAt(i);
    }

    /* renamed from: b */
    public final int mo31798b() {
        return this.f31698a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb4)) {
            return false;
        }
        fb4 fb4 = (fb4) obj;
        if (d13.f20195a >= 24) {
            return this.f31698a.equals(fb4.f31698a);
        }
        if (this.f31698a.size() != fb4.f31698a.size()) {
            return false;
        }
        for (int i = 0; i < this.f31698a.size(); i++) {
            if (mo31797a(i) != fb4.mo31797a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (d13.f20195a >= 24) {
            return this.f31698a.hashCode();
        }
        int size = this.f31698a.size();
        for (int i = 0; i < this.f31698a.size(); i++) {
            size = (size * 31) + mo31797a(i);
        }
        return size;
    }
}
