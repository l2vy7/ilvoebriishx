package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.jd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C7827jd implements Callable {

    /* renamed from: a */
    protected final String f33844a = getClass().getSimpleName();

    /* renamed from: b */
    protected final C8400zb f33845b;

    /* renamed from: c */
    protected final String f33846c;

    /* renamed from: d */
    protected final String f33847d;

    /* renamed from: e */
    protected final C7600d8 f33848e;

    /* renamed from: f */
    protected Method f33849f;

    /* renamed from: g */
    protected final int f33850g;

    /* renamed from: h */
    protected final int f33851h;

    public C7827jd(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2) {
        this.f33845b = zbVar;
        this.f33846c = str;
        this.f33847d = str2;
        this.f33848e = d8Var;
        this.f33850g = i;
        this.f33851h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo30349b() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: c */
    public Void mo32879c() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method j = this.f33845b.mo36036j(this.f33846c, this.f33847d);
            this.f33849f = j;
            if (j == null) {
                return null;
            }
            mo30349b();
            C8257va d = this.f33845b.mo36031d();
            if (!(d == null || (i = this.f33850g) == Integer.MIN_VALUE)) {
                d.mo35394c(this.f33851h, i, (System.nanoTime() - nanoTime) / 1000, (String) null, (Exception) null);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        mo32879c();
        return null;
    }
}
