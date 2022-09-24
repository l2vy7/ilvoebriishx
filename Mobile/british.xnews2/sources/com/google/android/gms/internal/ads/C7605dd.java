package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.dd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7605dd extends C7827jd {

    /* renamed from: i */
    private static volatile Long f30716i;

    /* renamed from: j */
    private static final Object f30717j = new Object();

    public C7605dd(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2) {
        super(zbVar, "M8X9pjLXmkUmNpxAUiXCS0VzRrfgsx47JCdWPtF77o1zbxjaTxGH9o3y3XsfapA3", "IGAB4+J/PDJStxsBeRODYeAaV8Ap48L0bK2MK3UJNBs=", d8Var, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        if (f30716i == null) {
            synchronized (f30717j) {
                if (f30716i == null) {
                    f30716i = (Long) this.f33849f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f33848e) {
            this.f33848e.mo31152U(f30716i.longValue());
        }
    }
}
