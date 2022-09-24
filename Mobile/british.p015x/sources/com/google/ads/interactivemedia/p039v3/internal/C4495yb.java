package com.google.ads.interactivemedia.p039v3.internal;

import android.text.TextUtils;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yb */
/* compiled from: IMASDK */
final class C4495yb {

    /* renamed from: a */
    public final String f19675a;

    /* renamed from: b */
    public final boolean f19676b;

    /* renamed from: c */
    public final boolean f19677c;

    public C4495yb(String str, boolean z, boolean z2) {
        this.f19675a = str;
        this.f19676b = z;
        this.f19677c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C4495yb.class) {
            C4495yb ybVar = (C4495yb) obj;
            return TextUtils.equals(this.f19675a, ybVar.f19675a) && this.f19676b == ybVar.f19676b && this.f19677c == ybVar.f19677c;
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f19675a.hashCode() + 31) * 31) + (true != this.f19676b ? 1237 : 1231)) * 31;
        if (true == this.f19677c) {
            i = 1231;
        }
        return hashCode + i;
    }
}
