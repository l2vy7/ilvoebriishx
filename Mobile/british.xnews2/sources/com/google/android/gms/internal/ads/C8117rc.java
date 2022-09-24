package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.rc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8117rc extends C7827jd {

    /* renamed from: i */
    private static volatile Long f38621i;

    /* renamed from: j */
    private static final Object f38622j = new Object();

    public C8117rc(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2) {
        super(zbVar, "hUIXYyX7voAFfmX9K6Tyj7UNRMoApsO3NHhichzgf1HY6Km4YpCnpT8GA4sfwulx", "RhEw32BK9OU3wzUC3Jj98VTZvnt6yWz3Jzx/x8tD2qo=", d8Var, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        if (f38621i == null) {
            synchronized (f38622j) {
                if (f38621i == null) {
                    f38621i = (Long) this.f33849f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f33848e) {
            this.f33848e.mo31184z0(f38621i.longValue());
        }
    }
}
