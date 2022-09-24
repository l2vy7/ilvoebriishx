package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.ed */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7642ed extends C7827jd {
    public C7642ed(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2) {
        super(zbVar, "uUtXgghNropSfe2KUSoP0Efn1EgB4X6maOF+tPLLzG1rSS0RqDSE3s9EWbbdwRaZ", "iu0TCa9uEtKUas610luihENZAQIiF7MRaL5XfmToU24=", d8Var, i, 48);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        this.f33848e.mo31163f0(3);
        boolean booleanValue = ((Boolean) this.f33849f.invoke((Object) null, new Object[]{this.f33845b.mo36029b()})).booleanValue();
        synchronized (this.f33848e) {
            if (booleanValue) {
                this.f33848e.mo31163f0(2);
            } else {
                this.f33848e.mo31163f0(1);
            }
        }
    }
}
