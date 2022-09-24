package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class s34 {

    /* renamed from: a */
    public final String f38864a;

    /* renamed from: b */
    public final boolean f38865b;

    /* renamed from: c */
    public final boolean f38866c;

    public s34(String str, boolean z, boolean z2) {
        this.f38864a = str;
        this.f38865b = z;
        this.f38866c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s34.class) {
            s34 s34 = (s34) obj;
            return TextUtils.equals(this.f38864a, s34.f38864a) && this.f38865b == s34.f38865b && this.f38866c == s34.f38866c;
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f38864a.hashCode() + 31) * 31) + (true != this.f38865b ? 1237 : 1231)) * 31;
        if (true == this.f38866c) {
            i = 1231;
        }
        return hashCode + i;
    }
}
