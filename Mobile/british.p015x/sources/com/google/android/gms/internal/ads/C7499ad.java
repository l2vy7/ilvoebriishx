package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.ad */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7499ad extends C7827jd {

    /* renamed from: i */
    private final StackTraceElement[] f29605i;

    public C7499ad(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zbVar, "xd283h5qAcacM5zVZnbCaCYEYmyBvCzSWmcoDFc838gJ/DBCdoedE0EgOC5ZJs5s", "KFN28huBDzw/UNPPRO5YgG4GEIzzfegN1j75wmksmGk=", d8Var, i, 45);
        this.f29605i = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f29605i;
        if (obj != null) {
            int i = 1;
            C8150sb sbVar = new C8150sb((String) this.f33849f.invoke((Object) null, new Object[]{obj}));
            synchronized (this.f33848e) {
                this.f33848e.mo31133B(sbVar.f38938b.longValue());
                if (sbVar.f38939c.booleanValue()) {
                    C7600d8 d8Var = this.f33848e;
                    if (true != sbVar.f38940d.booleanValue()) {
                        i = 2;
                    }
                    d8Var.mo31159b0(i);
                } else {
                    this.f33848e.mo31159b0(3);
                }
            }
        }
    }
}
