package com.google.ads.interactivemedia.p039v3.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ig */
/* compiled from: IMASDK */
public abstract class C4068ig implements Callable {

    /* renamed from: a */
    protected final C4037hc f17420a;

    /* renamed from: b */
    protected final String f17421b;

    /* renamed from: c */
    protected final String f17422c;

    /* renamed from: d */
    protected final C4115k f17423d;

    /* renamed from: e */
    protected Method f17424e;

    /* renamed from: f */
    protected final int f17425f;

    /* renamed from: g */
    protected final int f17426g;

    public C4068ig(C4037hc hcVar, String str, String str2, C4115k kVar, int i, int i2) {
        this.f17420a = hcVar;
        this.f17421b = str;
        this.f17422c = str2;
        this.f17423d = kVar;
        this.f17425f = i;
        this.f17426g = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15910a() throws IllegalAccessException, InvocationTargetException;

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        mo15912d();
        return null;
    }

    /* renamed from: d */
    public void mo15912d() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method m = this.f17420a.mo15905m(this.f17421b, this.f17422c);
            this.f17424e = m;
            if (m != null) {
                mo15910a();
                C4018gk h = this.f17420a.mo15900h();
                if (h != null && (i = this.f17425f) != Integer.MIN_VALUE) {
                    h.mo15863a(this.f17426g, i, (System.nanoTime() - nanoTime) / 1000, (String) null, (Exception) null);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
