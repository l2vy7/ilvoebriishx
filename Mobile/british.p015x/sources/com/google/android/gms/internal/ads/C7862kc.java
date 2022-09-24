package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.kc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7862kc extends C7827jd {

    /* renamed from: j */
    private static final C7863kd<String> f34234j = new C7863kd<>();

    /* renamed from: i */
    private final Context f34235i;

    public C7862kc(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2, Context context) {
        super(zbVar, "t7YLiNn9wSLVfNzBPSP796qGY15c9YWt19X86sjfqa1MN8DTMOAxKskDGE2b7plQ", "lEEnhl5euaIfSg9vXz1JH43pBH/xGM9fvSrfPaUZwEI=", d8Var, i, 29);
        this.f34235i = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        this.f33848e.mo31174q0("E");
        AtomicReference<String> a = f34234j.mo33067a(this.f34235i.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f33849f.invoke((Object) null, new Object[]{this.f34235i}));
                }
            }
        }
        String str = a.get();
        synchronized (this.f33848e) {
            this.f33848e.mo31174q0(C7859k9.m33875a(str.getBytes(), true));
        }
    }
}
