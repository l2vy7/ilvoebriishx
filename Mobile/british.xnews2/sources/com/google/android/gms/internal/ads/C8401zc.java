package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.zc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8401zc extends C7827jd {

    /* renamed from: i */
    private final boolean f42417i;

    public C8401zc(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2) {
        super(zbVar, "yRC8yDQzUDrmroLbdHZh1cdlZfd8ub/FsIslAHpddfKGkTWa/jUYdNJ0tT+5diCM", "HM4qeDzacgZSWStWAwQJTi2Amm6uvEB2WlZumyUY0B8=", d8Var, i, 61);
        this.f42417i = zbVar.mo36043s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f33849f.invoke((Object) null, new Object[]{this.f33845b.mo36029b(), Boolean.valueOf(this.f42417i)})).longValue();
        synchronized (this.f33848e) {
            this.f33848e.mo31182y(longValue);
        }
    }
}
