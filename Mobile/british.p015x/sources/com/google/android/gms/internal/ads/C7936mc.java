package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.mc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7936mc extends C7827jd {
    public C7936mc(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2) {
        super(zbVar, "glZYRiAaVgXhfq7gmv5KdTlxK1u1W7CDU+wEOCdR48SsabliUSLxOyNuMGeUOQq8", "BXtZidg/K24z5N/YUAEC4oPRR4OaYUycAQjBgFG9Ir4=", d8Var, i, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        this.f33848e.mo31173p0(-1);
        this.f33848e.mo31172o0(-1);
        int[] iArr = (int[]) this.f33849f.invoke((Object) null, new Object[]{this.f33845b.mo36029b()});
        synchronized (this.f33848e) {
            this.f33848e.mo31173p0((long) iArr[0]);
            this.f33848e.mo31172o0((long) iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.f33848e.mo31171n0((long) i);
            }
        }
    }
}
