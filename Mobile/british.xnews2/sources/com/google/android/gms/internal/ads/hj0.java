package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C7408m;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hj0 extends jj0 {

    /* renamed from: b */
    private final String f32744b;

    /* renamed from: c */
    private final int f32745c;

    public hj0(String str, int i) {
        this.f32744b = str;
        this.f32745c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof hj0)) {
            hj0 hj0 = (hj0) obj;
            if (!C7408m.m30028a(this.f32744b, hj0.f32744b) || !C7408m.m30028a(Integer.valueOf(this.f32745c), Integer.valueOf(hj0.f32745c))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.f32745c;
    }

    public final String zzc() {
        return this.f32744b;
    }
}
