package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.oc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8010oc extends C7827jd {

    /* renamed from: i */
    private final long f36371i;

    public C8010oc(C8400zb zbVar, String str, String str2, C7600d8 d8Var, long j, int i, int i2) {
        super(zbVar, "llxemQySqp4ImE2+K1SCPJZsWjXNCqydynC9yBT/03FiPJ85o8JSvF0iMBwiw5vV", "Do3k5DuMuAsRGeDxKZVVE8+FSftLk9ZlBUPdFxDzrUE=", d8Var, i, 25);
        this.f36371i = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f33849f.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.f33848e) {
            this.f33848e.mo31180w0(longValue);
            long j = this.f36371i;
            if (j != 0) {
                this.f33848e.mo31150S(longValue - j);
                this.f33848e.mo31151T(this.f36371i);
            }
        }
    }
}
