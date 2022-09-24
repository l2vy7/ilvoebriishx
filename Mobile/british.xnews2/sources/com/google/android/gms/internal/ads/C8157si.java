package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.si */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8157si {

    /* renamed from: a */
    public final String f38972a;

    /* renamed from: b */
    public final boolean f38973b;

    public C8157si(String str, boolean z) {
        this.f38972a = str;
        this.f38973b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C8157si.class) {
            C8157si siVar = (C8157si) obj;
            return TextUtils.equals(this.f38972a, siVar.f38972a) && this.f38973b == siVar.f38973b;
        }
    }

    public final int hashCode() {
        String str = this.f38972a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.f38973b ? 1237 : 1231);
    }
}
