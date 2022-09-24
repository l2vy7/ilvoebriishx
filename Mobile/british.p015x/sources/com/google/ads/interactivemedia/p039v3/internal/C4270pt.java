package com.google.ads.interactivemedia.p039v3.internal;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pt */
/* compiled from: IMASDK */
public final class C4270pt {

    /* renamed from: a */
    public final String f18402a;

    /* renamed from: b */
    public final C4120ke f18403b;

    /* renamed from: c */
    public final C4120ke f18404c;

    /* renamed from: d */
    public final int f18405d;

    /* renamed from: e */
    public final int f18406e;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4270pt(java.lang.String r3, com.google.ads.interactivemedia.p039v3.internal.C4120ke r4, com.google.ads.interactivemedia.p039v3.internal.C4120ke r5, int r6, int r7) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x000a
            if (r7 != 0) goto L_0x000b
            r7 = 0
        L_0x000a:
            r0 = 1
        L_0x000b:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14885p(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0025
            r2.f18402a = r3
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r4)
            r2.f18403b = r4
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r5)
            r2.f18404c = r5
            r2.f18405d = r6
            r2.f18406e = r7
            return
        L_0x0025:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4270pt.<init>(java.lang.String, com.google.ads.interactivemedia.v3.internal.ke, com.google.ads.interactivemedia.v3.internal.ke, int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4270pt.class == obj.getClass()) {
            C4270pt ptVar = (C4270pt) obj;
            return this.f18405d == ptVar.f18405d && this.f18406e == ptVar.f18406e && this.f18402a.equals(ptVar.f18402a) && this.f18403b.equals(ptVar.f18403b) && this.f18404c.equals(ptVar.f18404c);
        }
    }

    public final int hashCode() {
        return ((((((((this.f18405d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f18406e) * 31) + this.f18402a.hashCode()) * 31) + this.f18403b.hashCode()) * 31) + this.f18404c.hashCode();
    }
}
